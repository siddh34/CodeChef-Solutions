import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int sum = A + B;

            if(1 <= 21 - sum && 21 - sum <= 10){
                System.out.println(21-sum);
            }
            else{
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}
