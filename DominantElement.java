import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DominantElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i <N; i++){
                int k = sc.nextInt();
                map.put(k,map.getOrDefault(k, 0) + 1);
            }

            int max = 0;
            for(int j: map.keySet()){
                if(max < map.get(j)){
                    max = map.get(j);
                }
            }

            int count = 0;
            for(int i: map.keySet()){
                if(max == map.get(i)){
                    count++;
                }
            }

            if(count == 1){
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
