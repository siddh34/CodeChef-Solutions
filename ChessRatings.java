import java.util.Scanner;

public class ChessRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int i = 0;

            if(X == Y){
                System.out.println(0);
            }
            else{
                while(X < Y){
                    i++;
                    X = X + 8;
                }
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
