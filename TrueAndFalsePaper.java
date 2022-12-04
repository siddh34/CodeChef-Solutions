import java.util.Scanner;

public class TrueAndFalsePaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            System.out.println(N - K);
        }
        
        sc.close();
    }
}
