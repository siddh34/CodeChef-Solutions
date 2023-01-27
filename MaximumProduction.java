import java.util.Scanner;

public class MaximumProduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(Math.max(x*7,d*y+(7-d)*z));
        }
        
        sc.close();
    }
}
