import java.util.Scanner;

public class Tekken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int min = Math.min(C,B);

            B = B - min;
            C = C - min;
            
            min = Math.min(B,A);
            
            A = A - min; 
            B = B - min;

            min = Math.min(A,C);

            C = C - min;
            A = A - min;
            
            if(A > 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
