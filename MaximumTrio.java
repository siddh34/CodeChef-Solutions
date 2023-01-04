import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumTrio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Long> list = new ArrayList<Long>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextLong());
            }

            Collections.sort(list);

            System.out.println((list.get(N - 1) - list.get(0))*list.get(N - 2));

            list.clear();
        }
        
        sc.close();
    }
}
