import java.util.Scanner;

public class BearAndCandies123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            String winner = "";
            int i = 0;
            while(true){
                if((i*i) > A){
                    winner = "Bob";
                    break;
                }
                
                if((i*(i + 1)) > B){
                    winner = "Limak";
                    break;
                }
                i++;
            }
            System.out.println(winner);
        }
        
        sc.close();
    }
}
