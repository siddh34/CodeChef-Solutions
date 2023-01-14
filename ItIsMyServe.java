import java.util.Scanner;

public class ItIsMyServe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int A = 0, B = 0;
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(A == 2){
                System.out.println("Bob");
                B++;
            }
            else if(B == 2){
                System.out.println("Alice");
                A++;
            }
            else if(X < Y){
                System.out.println("Bob");
                B++;
            }
            else if(X > Y){
                System.out.println("Alice");
                A++;
            }
            else{
                System.out.println("Alice");
                A++;
            }
        }
        
        sc.close();
    }
}
