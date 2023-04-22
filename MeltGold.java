import java.util.Scanner;

public class MeltGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int Y = sc.nextInt();
            int X = sc.nextInt();

            int i = 0;
            while(X < Y){
                X = X + i;
                i++;
            }

            System.out.println(i - 1);
        }
        
        sc.close();
    }
}
