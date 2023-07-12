import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        while((--T)>=0){
            int N = sc.nextInt();
            long ans = 0;
            for(int i = 0; i < N; i++){
                arr.add(sc.nextInt());
                ans += i;
            }

            System.out.println(ans);

            arr.clear();
        }
        
        sc.close();
    }
}