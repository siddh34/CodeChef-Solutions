import java.util.Scanner;

public class QualifyTheRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(X <= (A + (B*2))){
                System.out.println("Qualify");
            }
            else{
                System.out.println("NotQualify");
            }
        }
        
        sc.close();
    }
}
