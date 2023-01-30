import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoRanges {
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<Integer> l1 = new HashSet<Integer>();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            
            for(int i = A; i <= B; i++) {
                l1.add(i);
            }
            
            for(int i = C; i <= D; i++) {
                l1.add(i);
            }

            System.out.println(l1.size());
            
            l1.clear();
        }
        
        sc.close();
    }
}
