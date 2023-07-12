import java.util.Scanner;

public class CaesarCipher {
    public static String applykRot(String cpihertext, int k) {
        StringBuilder sb = new StringBuilder();

        for (char c : cpihertext.toCharArray()) {
            if (Character.isLetter(c)) {
                // Shift the character k positions down the alphabet
                char shiftedChar = (char) (c + k);

                // Wrap around to the beginning of the alphabet if necessary
                if (shiftedChar > 'z') {
                    shiftedChar = (char) (shiftedChar - 26);
                }

                sb.append(shiftedChar);
            } else {
                sb.append(c); // Keep non-alphabetic characters as-is
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while ((--T) >= 0) {
            int N = sc.nextInt();

            String Si = sc.next();
            String Ti = sc.next();
            String msg = sc.next();

            int k = -1;
            for (int i = 0; i < N; i++) {
                char w1 = Si.charAt(i);
                char w2 = Ti.charAt(i);

                int diff = (w2 - w1 + 26) % 26;

                if (k == -1) {
                    k = diff;
                } else {
                    if (k != diff) {
                        k = -1;
                        break;
                    }
                }
            }
            // add function
            System.out.println(applykRot(msg, k));
        }
        sc.close();
    }
}
