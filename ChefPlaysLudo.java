import java.util.Scanner;

public class ChefPlaysLudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            if(N == 6){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}