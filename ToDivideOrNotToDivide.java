import java.util.Scanner;

public class ToDivideOrNotToDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            if(A % B == 0){
                System.out.println(-1);
            }
            else{
                int ans = N - N % A;
                if(N % A != 0) ans += A;

                if(ans % B == 0) ans += A;

                System.out.println(ans);
            }
        }
        sc.close();
    }
}
