import java.util.Scanner;

public class TwoDifferentPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if((a%2 != 0) && (b%2 != 0)) System.out.println("No");
            else if ((((a + b) % 2) != 0) && ((a == 1) || (b == 1))) System.out.println("No");
            else System.out.println("Yes");
        }
        sc.close();
    }
}
