import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class LongestCommonPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String A = sc.next();
            String B = sc.next();

            int n = A.length();
            int m = B.length();

            HashMap<Character,Integer> H1 = new HashMap<>();
            HashMap<Character,Integer> H2 = new HashMap<>();

            for(int i = 0; i < n; i++){
                char temp = A.charAt(i);
                H1.put(temp,H1.getOrDefault(temp,0)+1);
            }

            for(int i = 0; i < m; i++){
                char temp = B.charAt(i);
                H2.put(temp,H2.getOrDefault(temp,0)+1);
            }

            int count = 0;
            for(Entry<Character,Integer> entry : H1.entrySet()){
                if(H2.containsKey(entry.getKey())){
                    count += Math.min(H2.get(entry.getKey()),entry.getValue());
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
