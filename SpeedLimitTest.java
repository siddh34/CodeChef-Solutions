import java.util.Scanner;

public class SpeedLimitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float A = sc.nextFloat();
            float X = sc.nextFloat();
            float B = sc.nextFloat();
            float Y = sc.nextFloat();


            if((A/X) > (B/Y)){
                System.out.println("Alice");
            }
            else if((A/X) < (B/Y)){
                System.out.println("Bob");
            }
            else{
                System.out.println("Equal");
            }
        }
        
        sc.close();
    }
}
