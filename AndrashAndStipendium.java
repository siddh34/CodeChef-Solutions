import java.util.Scanner;

public class AndrashAndStipendium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while ((--T) >= 0) {
            int n = sc.nextInt();
            // int[] a = new int[n];
            int sum = 0;
            int b = 0;
            int b1 = 0;
            int a1 = 0;
            for (int i = 0; i < n; i++) {
                a1 = sc.nextInt();
                if (a1 == 5) {
                    b = 1;
                }
                if (a1 == 2) {
                    b1 = 1;
                }
                sum += a1;
            }
            if (b1 == 0 && b == 1 && (sum / n) >= 4.0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
