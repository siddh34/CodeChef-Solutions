import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class IsolationCenters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int Q = sc.nextInt();
            sc.nextLine();
            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();

            for(int i = 0; i < N; i++){
                char c = str.charAt(i);
                map.put(c,map.getOrDefault(c,0)+1);
            }

            while(Q-->0){
                int num = sc.nextInt();
                int queue = 0;

                for (Entry<Character, Integer> e : map.entrySet()) {
                    if(e.getValue() - num > 0){
                        int temp = e.getValue() - num;
                        queue += temp;
                    }
                }

                System.out.println(queue);
            }
        }
        sc.close();
    }
}
