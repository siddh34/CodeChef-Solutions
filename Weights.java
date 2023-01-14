import java.util.Scanner;

public class Weights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if(X == W || Y == W || Z == W){
                System.out.println("YES");
            }
            else if (Z + X == W || Z + Y == W || X + Y == W){
                System.out.println("YES");
            }
            else if(X + Y + Z == W){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
