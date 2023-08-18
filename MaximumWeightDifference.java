import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            long W[] = new long[N];

            K = Math.min(N-K,K);
            for(int i = 0; i < N; i++){
                W[i] = sc.nextLong();
            }

            Arrays.sort(W);
            long littlesum = 0;
            for(int i = 0; i < K; i++){
                littlesum += W[i];
            }

            long chefsum = 0;
            for(int i = (int) K; i < N; i++){
                chefsum += W[i];
            }

            System.out.println(chefsum - littlesum);
        }
        sc.close();
    }
}
