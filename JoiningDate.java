import java.util.Scanner;

public class JoiningDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            N = N/5 + (N%5 == 0 ? 0 : 1);
            K = K/5 + (K%5 == 0 ? 0 : 1);

            System.out.println(N-K);
        }
        
        sc.close();
    }
}
