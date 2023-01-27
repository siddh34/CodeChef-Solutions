import java.util.Scanner;

public class Coldplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int M = sc.nextInt();
            int S = sc.nextInt();

            int i = 0;
            for(i = 0; i*S <= M; i++){}

            System.out.println(i - 1);
        }
        
        sc.close();
    }
}
