import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EVacuateToMoon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int H = sc.nextInt();

            Long A[] = new Long[N];
            Long B[] = new Long[M];

            for(int i = 0; i < N; i++){
                A[i] = sc.nextLong();
            }

            for(int i = 0; i < M; i++){
                B[i] = sc.nextLong();
            }

            Arrays.sort(A,Collections.reverseOrder());
            Arrays.sort(B,Collections.reverseOrder());

            int K = Math.min(N,M);
            long ans = 0;
            for(int i = 0; i < K; i++){
                ans += Math.min(A[i],H*B[i]);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
