import java.util.Arrays;
import java.util.Scanner;

public class BalancedReversals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T) >= 0){

            // int N = sc.nextInt(); // make sure to uncomment it 

            String A = sc.next();


            char[] Ai = A.toCharArray();

            Arrays.sort(Ai);

            for(char j: Ai){
                System.out.print(j);
            }
            System.out.println();
        }
        
        sc.close();
    }
}
