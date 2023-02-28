import java.util.Scanner;

public class MagicianVersusChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int S = sc.nextInt();

            if(N > S){}

            int coin = X;
            for(int i = 0; i < S; i++){
                int A = sc.nextInt();
                int B = sc.nextInt();
                if(A == coin){
                    coin = B;
                }
                else if(B == coin){
                    coin = A;
                }
            }

            System.out.println(coin);
        }
        
        sc.close();
    }
}
