import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ScoreHigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> scores = new ArrayList<>();

        while((--T) >= 0){
            int N = sc.nextInt();
            N = 4;
            for(int i = 0; i < N; i++){
                scores.add(sc.nextInt());
            }

            Collections.sort(scores);

            System.out.println(scores.get(scores.size() - 1));
            scores.clear();
        }
        
        sc.close();
    }
}
