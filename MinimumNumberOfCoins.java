import java.util.Scanner;

public class MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            if(X % 5 == 0 && X % 10 == 0){
                System.out.println(X/10);
            }
            else if(X % 5 == 0){
                System.out.println(((X - 5)/10) + 1);
            }
            else{
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}
