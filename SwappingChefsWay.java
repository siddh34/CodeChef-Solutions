import java.util.Arrays;
import java.util.Scanner;

public class SwappingChefsWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String S = sc.next();

            char[] chars = S.toCharArray();

            Arrays.sort(chars);

            String sorted = new String(chars);

            char[] sortedChars = sorted.toCharArray();

            for(int i = 0; i < N/2; ++i){
                if(S.charAt(i) != sortedChars[i]){
                    char temp = sortedChars[i];
                    sortedChars[i] = sortedChars[N - 1 - i];
                    sortedChars[N - 1 - i] = temp;
                }
            }

            String  newSorted = new String(sortedChars);

            if(newSorted.equals(S)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        
        sc.close();
    }
}
