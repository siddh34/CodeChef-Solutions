import java.util.Scanner;

public class TheAttackOfQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int horizontal = 2 * (n - 1);
            int diagonal = 0;
            diagonal += Math.min(x - 1, y - 1);
            diagonal += Math.min(x - 1, n - y);
            diagonal += Math.min(n - x, y - 1);
            diagonal += Math.min(n - x, n - y);

            System.out.println(horizontal+diagonal);
        }
        
        sc.close();
    }
}
