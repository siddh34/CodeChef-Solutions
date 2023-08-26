import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChefAndKingship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Long> P = new ArrayList<>();
        while(T-->0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                P.add(sc.nextLong());
            }

            Collections.sort(P);
            long cost = 0;
            for(int i = 1; i < P.size(); i++){
                cost += P.get(0)*P.get(i);
            }

            System.out.println(cost);

            P.clear();
        }
        sc.close();
    }
}
