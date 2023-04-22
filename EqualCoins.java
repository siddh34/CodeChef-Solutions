import java.util.Scanner;

public class EqualCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(X == 0 && Y % 2 != 0){
                System.out.println("NO");
            }
            else if((X + Y*2) % 2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
