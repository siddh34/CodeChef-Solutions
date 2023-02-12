import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentSumParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            int sum = 0;
            for(int i: list){
                sum += i;
            }

            if(sum % 2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            list.clear();
        }
        
        sc.close();
    }
}
