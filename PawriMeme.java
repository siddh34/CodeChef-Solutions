import java.util.Scanner;

public class PawriMeme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();

            String R = S.replaceAll("party", "pawri");

            System.out.println(R);
        }
        
        sc.close();
    }
}
