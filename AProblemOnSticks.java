import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AProblemOnSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<Long> A = new HashSet<Long>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextLong());
            }

            System.out.println(A.contains((long)0) ? A.size() - 1: A.size());

            A.clear();
        }
        
        sc.close();
    }
}
