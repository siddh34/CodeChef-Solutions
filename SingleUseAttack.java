import java.util.Scanner;

public class SingleUseAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int hp = H - Y;
            int count = 1;

            while(hp > 0){
                hp = hp - X;
                count++;
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
