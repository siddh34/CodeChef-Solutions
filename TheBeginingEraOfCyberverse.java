import java.util.Scanner;

public class TheBeginingEraOfCyberverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            System.out.println(M/N);
        }
        
        sc.close();
    }
}
