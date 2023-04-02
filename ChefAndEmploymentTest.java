import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChefAndEmploymentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            Collections.sort(A);

            int sum = (N + K) / 2;

            System.out.println(A.get(sum));

            A.clear();
        }
        
        sc.close();
    }
}
