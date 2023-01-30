import java.util.Scanner;

public class TheRatingDilemma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int S = sc.nextInt();

            System.out.println((S+1)*(-1));
        }
        
        sc.close();
    }
}
