import java.util.Scanner;

public class CodechefAirlines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            int capacity = X*10;

            if(capacity >= Y){
                System.out.println(Z*Y);
            }
            else{
                System.out.println(capacity*Z);
            }
        }
        
        sc.close();
    }
}
