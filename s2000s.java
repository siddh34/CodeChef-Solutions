import java.util.Scanner;

/**
 * 2000
 */
public class s2000s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println((n*2000) / 500);

        sc.close();
    }
}