import java.util.Scanner;

public class ChefInHisOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(X*4 + Y);
        }
        
        sc.close();
    }
}
