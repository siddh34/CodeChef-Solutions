import java.util.Scanner;

public class KthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int result = 0;
            int s1 = n / 3;
            int s2 = n / 3;

            if (n % 3 == 1) {
                s1 = s1 + 1;
            } else if (n % 3 == 2) {
                s1 = s1 + 1;
                s2 = s2 + 1;
            }

            if (k <= s1) {
                result = (k * 3) - 2;
            } else if (k > s1 && k <= (s1 + s2)) {
                result = (k - s1) * 3 - 1;
            } else {
                result = (k - (s1 + s2)) * 3;
            }

            System.out.println(result);
        }
        sc.close();
    }
}
