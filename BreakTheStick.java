import java.util.Scanner;

public class BreakTheStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            if(N % X == 0){
                System.out.println("YES");
            }
            else if(N%2 == 0 && X % 2 == 0 || X % 2 == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
