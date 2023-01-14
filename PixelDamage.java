import java.util.Scanner;

public class PixelDamage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long H = sc.nextLong();
            Long W = sc.nextLong();
            Long X = sc.nextLong();
            Long Y = sc.nextLong();
            Long K = sc.nextLong();

            double dist = Math.sqrt(Math.pow((W - X),2) + Math.pow((H - Y),2));

            if(dist < K){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}
