import java.util.Scanner;

public class GameBetweenFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            
            if(A >= B){
                B += C;
            }
            else{
                A += C;
            }

            if(A >= B){
                B += D;
            }
            else{
                A += D;
            }

            if(A >= B){
                System.out.println("N");
            }
            else{
                System.out.println("S");
            }
        }
        
        sc.close();
    }
}
