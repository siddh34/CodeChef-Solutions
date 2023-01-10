import java.util.Scanner;

public class MarioAndBullet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int reachingTime = Y/X;

            if(Z - reachingTime< 0){
                System.out.println(0);
            }
            else{
                System.out.println(Z - reachingTime);
            }
        }
        
        sc.close();
    }
}
