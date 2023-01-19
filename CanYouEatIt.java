import java.util.Scanner;

public class CanYouEatIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long N = sc.nextLong();
            Long K = sc.nextLong();

            if(N % K == 0){
                System.out.println(N/K);
            }
            else{
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}
