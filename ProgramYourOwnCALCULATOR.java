import java.util.Scanner;

public class ProgramYourOwnCALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        String op = sc.next();

        switch (op) {
            case "+": {
                System.out.println(A + B);
                break;
            }
            case "-": {
                System.out.println(A - B);
                break;
            }
            case "*": {
                System.out.println((1.0*A) * B);
                break;
            }
            case "/": {
                System.out.println(A / B);
                break;
            }
        }

        sc.close();
    }
}
