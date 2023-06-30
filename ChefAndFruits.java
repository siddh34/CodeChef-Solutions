import java.util.Scanner;

public class ChefAndFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int result = N > M ? N - M : M - N;

            result = result - K;

            System.out.println(result >= 0 ? result : 0);
        }
        
        sc.close();
    }
}