import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumNumberOfFlips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> numbers = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                numbers.add(sc.nextInt());
            }

            int sum = 0;
            for(int k: numbers){
                sum += k;
            }

            if((sum%2) == 1){
                System.out.println(-1);
            }
            else{
                System.out.println(Math.abs(sum/2));
            }

            numbers.clear();
        }
        
        sc.close();
    }
}
