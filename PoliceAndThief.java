import java.util.Scanner;

public class PoliceAndThief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(Math.abs(Y-X));
        }
        
        sc.close();
    }
}
