import java.util.Scanner;

public class BullOrBear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(X > Y){
                System.out.println("LOSS");
            }
            else if(X == Y){
                System.out.println("NEUTRAL");
            }
            else{
                System.out.println("PROFIT");
            }
        }
        
        sc.close();
    }
}
