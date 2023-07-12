import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TheSmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        
        while((--T)>=0){
            int N = sc.nextInt();

            for(int i = 0; i<N; i++){
                arr.add(sc.nextInt());
            }

            Collections.sort(arr);
            
            System.out.println(arr.get(0) + arr.get(1));

            arr.clear();
        }
        
        sc.close();
    }
}
