import java.util.Scanner;

public class MonopolyInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if(A > B + C){
                System.out.println("YES");
            }
            else if(B > A + C){
                System.out.println("YES");
            }   
            else if(C > B + A){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            T--;
        }

        sc.close();
    }
}
