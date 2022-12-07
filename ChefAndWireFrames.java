import java.util.Scanner;

public class ChefAndWireFrames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(X*((2*M)+(2*N)));
        }
        
        sc.close();
    }
}
