import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeThemEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        List<Integer> A = new ArrayList<>();
        while(T-->0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < N; i++){
                min = Math.min(min,A.get(i));
                max = Math.max(max,A.get(i));
            }

            System.out.println(max - min);

            A.clear();
        }
        sc.close();
    }
}
