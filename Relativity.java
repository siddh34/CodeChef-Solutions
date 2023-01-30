import java.util.Scanner;

public class Relativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int g = sc.nextInt();
            int c = sc.nextInt();

            int h = c*c / (2 * g);

            System.out.println(h);
        }
        
        sc.close();
    }
}
