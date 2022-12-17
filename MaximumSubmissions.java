import java.util.Scanner;

public class MaximumSubmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            System.out.println(X*2);
        }
        
        sc.close();
    }
}
