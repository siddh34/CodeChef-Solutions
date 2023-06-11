import java.util.Scanner;

public class StickBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int L = sc.nextInt();
            int K = sc.nextInt();

            if(L == K || L % K == 0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}
