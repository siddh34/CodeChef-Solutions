import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheOneWithRuss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            for(int i = 0; i < N; i++){
                B.add(sc.nextInt());
            }

            int count = 0;
            for(int i = 0; i < N; i++){
                if(Math.abs(A.get(i) - B.get(i)) <= K){
                    count++;
                }
            }

            if(count >= X){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            A.clear();
            B.clear();
        }
        
        sc.close();
    }
}