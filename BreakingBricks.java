import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingBricks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer> W = new ArrayList<Integer>();
        
        while((--T) >= 0){
            int S = sc.nextInt();

            int sum = 0;
            for(int i = 0; i < 3; i++){
                W.add(sc.nextInt());
                sum += W.get(i);
            }

            int max = Math.max(W.get(0),W.get(2));

            int answer;

            if(sum <= S){
                answer = 1;
            }
            else if(sum - max <= S){
                answer = 2;
            }
            else{
                answer = 3;
            }

            System.out.println(answer);

            W.clear();
        }
        
        sc.close();
    }
}
