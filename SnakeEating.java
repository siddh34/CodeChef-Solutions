import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnakeEating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int Q = sc.nextInt();

            long S[] = new long[N];
            long sum = 0;
            for(int i = 0;i < N;i++){
                S[i] = sc.nextLong();
                sum += S[i];
            }
            Arrays.sort(S);
            long W[] = new long[N];
            HashMap<Long,Long> mp = new HashMap<>();
            for(int i = 0;i < Q;i++){
                W[i] = sc.nextLong();
                if(mp.containsKey(W[i]) == false){
                    mp.put(W[i],(long) -1);
                }
            }

            long arr[] = new long[mp.size()];
            int idx = 0;
            for(Map.Entry<Long,Long> pair : mp.entrySet()){
                arr[idx] = pair.getKey();
                idx += 1;
            }

            Arrays.sort(arr);
            int pt = 0,pt2 = 0;
            long cur = 0,cur2 = 0;

            for(int i = 0;i < arr.length;i++){
                while(pt2 < N && S[pt2] < arr[i]){
                    cur2 += S[pt2];
                    pt2++;
                }

                if(pt2 == N){
                    while(pt < N && (long) pt < (long)(N - pt) * arr[i] - (sum - cur)){
                        cur += (long) S[pt];
                        pt++;
                    }
                }
                else{
                    while(pt < pt2 && (long) pt < (long)(pt2 - pt) * arr[i] - (sum - cur - (sum - cur2))){
                        cur += S[pt];
                        pt++;
                    }
                }
                if(pt == pt2){
                    mp.put(arr[i],(long)(N-pt2));
                }
                else{
                    mp.put(arr[i],(long)((N-pt2) + (pt2 - pt)));
                }
            }

            for(int i = 0;i < Q;i++){
                System.out.println(mp.get(W[i]));
            }
        }
        sc.close();
    }
}
