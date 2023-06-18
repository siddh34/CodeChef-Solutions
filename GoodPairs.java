import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        while((--T)>=0){
            int N = sc.nextInt();
            
            int num = 0;
            for(int i = 0; i < N; i++){
                num = sc.nextInt();

                hm.put(num,hm.getOrDefault(num, 0) + 1);
            }

            int freq = 0;
            long ans = 0;
            for(Entry<Integer, Integer> e : hm.entrySet()){
                freq = e.getValue();

                ans += (long) freq*(freq - 1)/2;
            }

            System.out.println(ans);

            hm.clear();
        }
        sc.close();
    }
}
