import java.util.Scanner;

public class EqualCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int K = sc.nextInt();
            
            int count = 0;
            int cards = 52;
            while(cards % K != 0){
                cards -= 1;
                count++;
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
