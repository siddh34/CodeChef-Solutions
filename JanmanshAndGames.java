import java.util.Scanner;

public class JanmanshAndGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if((X+Y) % 2 == 0){
                System.out.println("Janmansh");
            }
            else{
                System.out.println("Jay");
            }
        }
        sc.close();
    }
}
