import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternatingSubarrayprefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        while((--T)>=0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            int count = 1;
            for(int i = 0; i < N-1; i++){
                for(int j = i; j < N - 1; j++){
                    if(list.get(j) >= 0 && list.get(j + 1) < 0){
                        count++;
                    }
                    else if(list.get(j + 1) >= 0 && list.get(j) < 0){
                        count++;
                    }
                    else{
                        arr.add(count);
                        count=1;
                    }
                }
            }

            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();

            list.clear();
            arr.clear();
        }
        
        sc.close();
    }
}
