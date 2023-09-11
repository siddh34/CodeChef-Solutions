import java.util.Scanner;

public class DistinctColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            int A[] = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

            int maximum = Integer.MIN_VALUE;

            for(int i = 0; i < N; i++){
                if(A[i] > maximum){
                    maximum = A[i];
                }
            }

            System.out.println(maximum);
        }
        sc.close();
    }
}
