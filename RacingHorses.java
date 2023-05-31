import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RacingHorses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> S = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt(); 

            for(int i = 0; i < N; i++){
                S.add(sc.nextInt());
            }

            Collections.sort(S);

            int min = Integer.MAX_VALUE;

            for(int i = 0; i < N - 1; i++){
                min = Math.min(min,S.get(i+1) - S.get(i));
            }

            System.out.println(min);

            S.clear();
        }
        
        sc.close();
    }
}
