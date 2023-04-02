import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            Long N = sc.nextLong();

            for(long i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            long max = list.get(0) + list.get((int) (N - 1));
            long sum = 0;
            for(long i = 0; i < N - 1; i++){
                long temp = list.get((int) i) + list.get((int) (i+1));
                if(temp > sum){
                    sum = temp;
                }
            }

            System.out.println(Math.max(sum,max));

            list.clear();
        }
        
        sc.close();
    }
}
