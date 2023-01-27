import java.util.Scanner;

public class ChefAndHisFruitStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int chaats = 0;

            
            while((X <= 100 && X >= 0) && (Y <= 100 && Y >= 0)){
                X = X - 2;
                Y = Y - 1;
                chaats++;
            }

            System.out.println(chaats - 1);
        }
        sc.close();
    }
}