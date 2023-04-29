import java.util.Scanner;

public class AkashAndFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            System.out.println((N+1)/2);
        }
        
        sc.close();
    }
}
