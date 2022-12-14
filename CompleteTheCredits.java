import java.util.Scanner;

public class CompleteTheCredits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            if(X <= 65 && X >= 35){
                System.out.println("NORMAL");
            }
            else if(X > 65){
                System.out.println("OVERLOAD");
            }
            else if(X < 35){
                System.out.println("UNDERLOAD");
            }
        }
        
        sc.close();
    }
}
