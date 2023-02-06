import java.util.Scanner;

public class Solubility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println((A + (Math.abs(100 - X)*B))*10);
        }
        
        sc.close();
    }
}
