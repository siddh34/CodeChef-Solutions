import java.util.Scanner;

public class WeightBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int w1 = sc.nextInt();
            int w2 = sc.nextInt();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int M = sc.nextInt();

            if((w2 - w1) >= x1*M && (w2 - w1) <= x2*M) {
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }

        }
        
        sc.close();
    }
}
