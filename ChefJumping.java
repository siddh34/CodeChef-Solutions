import java.util.Scanner;

public class ChefJumping {
    public static void main(String[] args) {
        // 0 1 3 6 10 
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        if( N % 6 == 0 || N % 2 == 1 || N % 3 == 3){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        
        sc.close();
    }
}
