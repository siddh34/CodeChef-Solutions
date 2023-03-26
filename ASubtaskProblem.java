import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ASubtaskProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            boolean isGood = true;
            for(int i = 0; i < M; i++){
                if(A.get(i) == 0){
                    isGood = false;
                    break;
                }
            }

            Collections.sort(A);

            if(A.get(0) == 1){
                System.out.println(100);
            }
            else if(isGood && A.get(0) == 0 ){
                System.out.println(K);
            }
            else{
                System.out.println(0);
            }

            A.clear();
        }
        
        sc.close();
    }
}
