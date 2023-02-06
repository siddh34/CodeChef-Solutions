import java.util.Scanner;

public class BackToCampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            int i = 1;
            while(i*K < N){
                i++;
            }

            System.out.println(i);
        }
        
        sc.close();
    }
}
