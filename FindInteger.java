import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String N = sc.next();
            char[] digits = N.toCharArray();
            Set<Character> C = new HashSet<Character>();

            while(true){
                int J = Integer.parseInt(N);
                J++;
                N = Integer.toString(J);
                digits = N.toCharArray();

                for(int i = 0; i < digits.length; i++){
                    C.add(digits[i]);
                }

                if(C.size() == N.length()){
                    break;
                }

                C.clear();
            }

            System.out.println(N);

        }
        
        sc.close();
    }
}
