import java.util.Scanner;

public class ThePreparations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();

            if(N*K >= M){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
