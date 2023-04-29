import java.util.Scanner;

public class IPLTicketRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N - M > 0){
                System.out.println(N-M);
            }
            else{
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}
