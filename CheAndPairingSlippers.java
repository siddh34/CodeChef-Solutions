import java.util.Scanner;

public class CheAndPairingSlippers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int L = sc.nextInt();
            int X = sc.nextInt();

            int diff = (N - L);

            if(diff < L){
                System.out.println(diff*X);
            }
            else{
                System.out.println(L*X);
            }
        }
        
        sc.close();
    }
}
