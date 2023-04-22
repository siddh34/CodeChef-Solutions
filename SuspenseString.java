import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SuspenseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        Deque<Character> ans = new ArrayDeque<>();
        while ((--T) >= 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int k = 0;

            while (!S.isEmpty() && k < N) {
                if (k % 2 == 0) {
                    char y = S.charAt(0);
                    if(y == '0'){
                        ans.addFirst('0');
                    }
                    else{
                        ans.addLast('1');
                    }
                    S = S.substring(1);
                } else {
                    char r = S.charAt(S.length() - 1);
                    if(r == '0'){
                        ans.addLast('0');
                    }
                    else{
                        ans.addFirst('1');
                    }
                    S = S.substring(0, S.length() - 1);
                }
                k++;
            }

            StringBuilder sb = new StringBuilder();

            for (char c : ans) {
                sb.append(c);
            }

            System.out.println(sb.toString());

            ans.clear();
        }

        sc.close();
    }
}
