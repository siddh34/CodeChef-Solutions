import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        DecimalFormat df = new DecimalFormat("0.000000");
        
        while((--T) >= 0){
            float X = sc.nextInt();
            float Y = sc.nextInt();

            if(X > 1000){
                X = X - (X/100)*10;
                System.out.println(df.format(X*Y));
            }
            else{
                System.out.println(df.format(X*Y));
            }
        }
        
        sc.close();
    }
}
