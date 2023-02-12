import java.util.Scanner;

public class CarRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int P = sc.nextInt();
            int M = sc.nextInt();
            int V = sc.nextInt();

            System.out.println((M - (P - 1))*V);
        }
        
        sc.close();
    }
}
