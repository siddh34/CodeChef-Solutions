import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertToPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        int N;
        List<Integer> A = new ArrayList<Integer>();

        while((--T) >= 0){
            N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            Collections.sort(A);

            int sum = 0, k = 0;
            for(int i = 0; i < A.size(); i++){
                if(A.get(i) > i + 1){
                    k = -1;
                }
                else{
                    sum += i+1 - A.get(i);
                }
            }

            if(k ==-1){
                System.out.println(-1);
            }
            else{
                System.out.println(sum);
            }

            A.clear();
        }
        
        sc.close();
    }
}
