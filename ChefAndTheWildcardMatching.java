import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefAndTheWildcardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        while((--T)>=0){
            String Str1 = sc.next();
            String Str2 = sc.next();

            int N = Str1.length();
            int K = Str2.length();

            boolean res = false;
            for(int i = 0,j = 0; i < N && j < K; i++, j++){
                if(Str1.charAt(i) == Str2.charAt(j) || Str1.charAt(i) == '?' || Str2.charAt(i) == '?'){
                    res = true;
                }
                else{
                    res = false;
                    break;
                }
            }

            if(res == true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            set1.clear();
            set2.clear();
        }

        sc.close();
    }
}
