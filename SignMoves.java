import java.util.Scanner;

public class SignMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            if(N % 2 == 0){
                System.out.println(N/2);
            }
            else{
                System.out.println(-1*((N + 1)/2));
            }
        }
        
        sc.close();
    }
}
