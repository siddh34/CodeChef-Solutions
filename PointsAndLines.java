import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PointsAndLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<Integer> x = new HashSet<Integer>();
        Set<Integer> y = new HashSet<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                x.add(sc.nextInt());
                y.add(sc.nextInt());
            }

            System.out.println(x.size() + y.size());

            x.clear();
            y.clear();
        }
        
        sc.close();
    }
}
