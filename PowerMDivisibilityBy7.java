import java.util.Scanner;

public class PowerMDivisibilityBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int M = sc.nextInt();

            int power = M % 4;
            long Y = 0;


            if(power == 0 && M!=0){
                power = 4;
            }

            while(X > 0){
                int digit = (int) Math.pow(X%10, power);
                digit = digit % 10;
                Y = Y*10 + digit;
                X = X / 10;
            }

            if(Y % 7 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
