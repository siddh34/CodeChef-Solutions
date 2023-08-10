import java.util.Arrays;
import java.util.Scanner;

public class YetAnotherPalindromeMakingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            String str = sc.next();
            char[] arr = str.toCharArray();

            String s1 = "";
            String s2 = "";
            for(int i = 0; i < N; i++){
                if(i % 2 == 0){
                    s1 += arr[i];
                }
                else{
                    s2 += arr[i];
                }
            }

            char p1[] = s1.toCharArray();
            char p2[] = s2.toCharArray();

            Arrays.sort(p1);
            Arrays.sort(p2);

            boolean pass = true;
            for(int i = 0; i < s1.length(); i++){
                if(p1[i] == p2[i]){
                    continue;
                }
                else{
                    pass = false;
                }
            }

            if(pass){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
