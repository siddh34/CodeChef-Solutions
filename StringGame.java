import java.util.Arrays;
import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String s = sc.next();
            
            if(N%2 != 0){
                System.out.println("NO");
                continue;
            }
            
            char[] letters = s.toCharArray();
            
            Arrays.sort(letters);


            boolean ok = true;
            for(int i = 0; i < N - 1; i+=2){
                if(letters[i] != letters[i+1]){
                    ok = false;
                    break;
                }
            }

            if(ok){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
