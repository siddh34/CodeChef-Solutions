import java.util.Scanner;

public class HardestProblemBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int Sa = sc.nextInt();
            int Sb = sc.nextInt();
            int Sc = sc.nextInt();

            if(Sa < Sb && Sa < Sc){
                System.out.println("DRAW");
            }
            else if(Sb < Sc && Sb < Sa){
                System.out.println("BOB");
            }
            else if(Sc < Sb && Sc < Sa){
                System.out.println("ALICE");
            }
        }
        
        sc.close();
    }
}
