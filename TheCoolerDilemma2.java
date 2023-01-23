import java.util.Scanner;

public class TheCoolerDilemma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long X = sc.nextLong();
            Long Y = sc.nextLong();
            
            if(X % Y == 0){
                System.out.println((Y/X-1));
            }
            else{
                System.out.println(Y/X);
            }
        }
        
        sc.close();
    }
}
