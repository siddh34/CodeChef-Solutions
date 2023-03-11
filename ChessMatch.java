import java.util.Scanner;

public class ChessMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            System.out.println((2*(180+N)) - (A + B));
        }
        
        sc.close();
    }
}
