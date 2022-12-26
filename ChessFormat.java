import java.util.Scanner;

public class ChessFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            if(A + B < 3){
                System.out.println(1);
            }
            else if(3 <= A + B && A + B <= 10){
                System.out.println(2);
            }
            else if(11 <= A + B && A + B <= 60){
                System.out.println(3);
            }
            else if(60 < A + B){
                System.out.println(4);
            }
        }
        
        sc.close();
    }
}
