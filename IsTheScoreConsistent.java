import java.util.Scanner;

public class IsTheScoreConsistent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        while(n!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            if(A <= C && B <= D){
                System.out.println("POSSIBLE");
            }
            else{
                System.out.println("IMPOSSIBLE");
            }

            n--;
        }

        sc.close();
    }
}
