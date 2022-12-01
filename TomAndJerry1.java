import java.util.Scanner;

public class TomAndJerry1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int K = sc.nextInt();
            int dist = Math.abs(A - C) + Math.abs(B - D);

            if(dist > K){
                System.out.println("NO");
            }
            else{
                if((K - dist) % 2 == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}
