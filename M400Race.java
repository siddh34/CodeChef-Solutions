import java.util.Scanner;

// the question originally spelled as 400M Race

public class M400Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while ((--T) >= 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int min = Math.min(A, B);
            min = Math.min(min, C);

            if (min == A) {
                System.out.println("ALICE");
            } else if (min == B) {
                System.out.println("BOB");
            }
            else if (min == C) {
                System.out.println("CHARLIE");
            }

        }
        sc.close();
    }
}
