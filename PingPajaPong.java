import java.util.Scanner;

public class PingPajaPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();

            if(((X+Y)%(2*K)) < K){
                System.out.println("Chef");
            }
            else{
                System.out.println("Paja");
            }
        }
        
        sc.close();
    }
}
