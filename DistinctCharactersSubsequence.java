import java.util.HashMap;
import java.util.Scanner;

public class DistinctCharactersSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String str = sc.next();

            HashMap<Character,Integer> map = new HashMap<>();
            
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                map.put(ch,map.getOrDefault(ch,0)+1);
            }

            System.out.println(map.size());
        }
        sc.close();
    }
}
