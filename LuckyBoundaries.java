import java.util.Scanner;

public class LuckyBoundaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int i = N;
            int flag = 0;
            while(flag < 1){
                if(N % i <= N/2){
                    flag = 1;
                    break;
                }
                i--;
            }

            System.out.println(i);
        }
        
        sc.close();
    }
}
