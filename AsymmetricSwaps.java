import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AsymmetricSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N*2; i++){
                A.add(sc.nextInt());
            }

            Collections.sort(A);

            int minValue = Integer.MAX_VALUE;
            for(int i = N*2 - 1; i >= N - 1; i--){
                minValue = Math.min(minValue, A.get(i) - A.get(i - N + 1));
            }

            System.out.println(minValue);

            A.clear();
        }
        
        sc.close();
    }
}
