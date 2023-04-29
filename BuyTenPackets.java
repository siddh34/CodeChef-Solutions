import java.util.Scanner;

public class BuyTenPackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(Math.min(X*5,Y*2 + X));
        }
        
        sc.close();
    }
}
