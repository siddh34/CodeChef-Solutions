import java.util.Scanner;

public class WaitingTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int K = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(K*7 - X);
        }
        
        sc.close();
    }
}
