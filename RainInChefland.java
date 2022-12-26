import java.util.Scanner;

public class RainInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            if(X < 3){
                System.out.println("LIGHT");
            }
            else if(X >= 3 && X < 7){
                System.out.println("MODERATE");
            }
            else if(X >= 7){
                System.out.println("HEAVY");
            }
        }
        
        sc.close();
    }
}
