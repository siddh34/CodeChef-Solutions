import java.util.Scanner;

public class CricketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int W1 = sc.nextInt();
            int R1 = sc.nextInt();
            int C1 = sc.nextInt();
            
            int W2 = sc.nextInt();
            int R2 = sc.nextInt();
            int C2 = sc.nextInt();

            int AisBetter = 0,BisBetter = 0;

            if(W1 > W2){
                AisBetter++;
            }
            else{
                BisBetter++;
            }

            if(R1 > R2){
                AisBetter++;
            }
            else{
                BisBetter++;
            }

            if(C1 > C2){
                AisBetter++;
            }
            else{
                BisBetter++;
            }

            if(AisBetter > BisBetter){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
        }
        
        sc.close();
    }
}
