import java.util.Scanner;

public class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(B > C && B > A){
                System.out.println("Bob");
            }
            else if(C > A && C > B){
                System.out.println("Charlie");
            }
            else{
                System.out.println("Alice");
            }
        }
        
        sc.close();
    }
}
