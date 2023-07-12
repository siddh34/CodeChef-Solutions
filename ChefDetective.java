import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChefDetective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> ms = new HashSet<Integer>();

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            ms.add(sc.nextInt());
        }

        for(int i = 0; i <= N; i++) {
            if(!ms.contains(i)){
                System.out.print(i+" ");
            }
        }
        
        sc.close();
    }
}
