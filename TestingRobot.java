import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestingRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            String S = sc.next();

            set.add(X);

            for(int i = 0; i < N; i++) {
                if(S.charAt(i) == 'R'){
                    X++;
                    set.add(X);
                }
                else if (S.charAt(i) == 'L'){
                    X--;
                    set.add(X);
                }
            }

            System.out.println(set.size());

            set.clear();
        }
        
        sc.close();
    }
}
