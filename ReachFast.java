import java.util.Scanner;

public class ReachFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();

            int i = 0;
            while(K*i < Math.abs(X-Y)){
                i++;
            }

            System.out.println(i);
        }
        
        sc.close();
    }
}
