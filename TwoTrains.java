import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoTrains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N - 1; i++){
                a.add(sc.nextInt());
            }
            

            Collections.sort(a);

            int extra = a.get(N - 2);

            int sum = 0;
            for(int i = 0; i < N - 1; i++){
                sum += a.get(i);
            }

            System.out.println(sum + extra);

            a.clear();
        }
        
        sc.close();
    }
}
