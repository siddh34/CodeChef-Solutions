import java.util.Scanner;

public class CREDCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int number = X*Y,k = 0;

            while(number > 0 && number >= 100){
                number = number - 100;
                k++;
            }

            System.out.println(k);
        }
        
        sc.close();
    }
}
