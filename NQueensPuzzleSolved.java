import java.util.Scanner;

public class NQueensPuzzleSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float N = sc.nextInt();

            float fn = (float) Math.pow(0.143 * N,N);
            
            System.out.println(Math.round(fn));
        }
        
        sc.close();
    }
}
