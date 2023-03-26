import java.util.Scanner;

public class MaskPolicy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int A = sc.nextInt();

            System.out.println(Math.min(N-A,A));
        }
        
        sc.close();
    }
}