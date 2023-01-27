import java.util.Scanner;

public class MakeAAndBEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A < B){
                while(A < B){
                    A *= 2;
                }
                if(A == B){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else if(A > B){
                while(B < A){
                    B *= 2;
                }

                if(A == B){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
