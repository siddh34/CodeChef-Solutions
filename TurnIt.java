import java.util.Scanner;

public class TurnIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float u = sc.nextInt();
            float v = sc.nextInt();
            float a = sc.nextInt();
            float s = sc.nextInt();

            double d = Math.sqrt(u*u - 2*a*s);

            if(d > v){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
