import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChefAndEid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> v = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                v.add(sc.nextInt());
            }

            Collections.sort(v);

            int min = 999999;
            for(int i = 0; i < N - 1; i++){
                int diff = v.get(i+1) - v.get(i);
                if(min>diff){
                    min = diff;
                }
            }

            System.out.println(min);

            v.clear();
        }
        
        sc.close();
    }
}
