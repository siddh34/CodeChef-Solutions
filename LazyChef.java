import java.util.Scanner;

public class LazyChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int M = sc.nextInt();
            int D = sc.nextInt();

            System.out.println(Math.min(X*M,X+D));
        }
        
        sc.close();
    }
}
