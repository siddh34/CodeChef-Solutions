import java.util.Scanner;

public class LargeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int A = sc.nextInt();

            System.out.println(A * ((int)Math.sqrt(N)));
        }
        sc.close();
    }
}
