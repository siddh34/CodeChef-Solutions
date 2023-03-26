import java.util.Scanner;

public class BrokenTelephone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while((--T) >= 0){
            int N = sc.nextInt();

            int A[] = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }

            int count = 0;

            if(A[0] != A[1]){
                count++;
            }

            if(A[N - 2] != A[N - 1]){
                count++;
            }

            for(int i = 1; i < N - 1; i++){
                if(A[i] != A[i+1] || A[i-1] != A[i]){
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
