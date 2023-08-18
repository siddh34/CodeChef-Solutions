import java.util.Scanner;

public class JustLikeMob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int X = sc.nextInt();

            int temp = (X%(M+(K*N)));
            if(temp > (N*(K-1)) || temp == 0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
    }
}
