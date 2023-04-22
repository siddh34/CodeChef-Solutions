import java.util.Scanner;

public class CricketMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            if(N > 6*6*M){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
        
        sc.close();
    }
}
