import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X > Y){
                System.out.println(Y);
            }
            else{
                System.out.println(X);
            }
        }
        
        sc.close();
    }
}
