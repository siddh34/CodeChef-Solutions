import java.util.Scanner;

public class JustOneMoreEpisode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            if(N > 24){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
