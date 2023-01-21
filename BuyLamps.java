import java.util.Scanner;

public class BuyLamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long N = sc.nextLong();
            Long K = sc.nextLong();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            Long cost = (long) 0;

            cost = Math.min(X*K + X*(N - K),X*K + Y*(N - K));

            System.out.println(cost);
        }
        
        sc.close();
    }
}
