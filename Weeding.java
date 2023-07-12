import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Weeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> A = new ArrayList<Integer>();
        while((--T)>=0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            int cal = A.get(N - 1) + K;
            if(cal <= M + 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }   

            A.clear();
        }
        
        sc.close();
    }
}
