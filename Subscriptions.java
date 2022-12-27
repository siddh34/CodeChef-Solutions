import java.util.Scanner;

public class Subscriptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            if(N % 6 == 0){
                System.out.println((N/6)*X);
            }
            else{
                int i;
                for(i = 0; i*6 < N;i++){}
                System.out.println(X*i);
            }
        }
        
        sc.close();
    }
}
