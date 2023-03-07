import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DannyWantsToKnow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Long> A = new ArrayList<Long>();
        List<Long> B = new ArrayList<Long>();

        int N = sc.nextInt();
        int Q = sc.nextInt();

        for(int i = 0; i < N; i++){
            A.add(sc.nextLong());
        }

        for(int i = 0; i < N; i++){
            B.add(sc.nextLong());
        }

        for(int i = 0; i < Q; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();

            long sum = 0;
            for(int j = L - 1; j < R; j++){
                sum += A.get(j)*B.get(j);
            }

            System.out.println(sum);
        }

        A.clear();
        B.clear();
        
        
        sc.close();
    }
}
