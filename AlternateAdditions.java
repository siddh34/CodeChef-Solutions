import java.util.Scanner;

public class AlternateAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            while(A < B){
                if(A % 2 == 0){
                    A = A + 2;
                }
                else{
                    A = A + 1;
                }
            }

            if(A == B){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        
        sc.close();
    }
}
