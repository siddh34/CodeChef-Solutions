import java.util.Scanner;

public class FillCandiesDifficulty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int k = sc.nextInt();
            int M = sc.nextInt();

            int totalCandiesByOneBag = k*M;
            int count = 0;

            while((totalCandiesByOneBag*count) <  N){
                count++;
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
