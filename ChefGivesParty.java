import java.util.Scanner;

public class ChefGivesParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();

            if((K-(N*X)) >= 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        
        sc.close();
    }
}
