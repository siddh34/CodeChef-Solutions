import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Note that it is also a problem named Group Assignment on codechef
public class GroupAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                int K = sc.nextInt();
                map.put(K, map.getOrDefault(K, 0) + 1);
            }

            boolean satisfy = true;
            for(int i: map.keySet()){
                if(map.get(i) % i != 0){
                    satisfy = false;
                    break;
                }
            }

            if(satisfy){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            map.clear();
        }
        
        sc.close();
    }
}
