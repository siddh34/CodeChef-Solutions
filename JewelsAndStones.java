import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        while((--T)>=0){
            String S = sc.next();
            String J = sc.next();

            char[] sarr = S.toCharArray();
            char[] jarr = J.toCharArray();

            Arrays.sort(sarr);
            Arrays.sort(jarr);

            
            for(int i = 0; i < sarr.length; i++){
                hm.put(sarr[i],hm.getOrDefault(sarr[i],0) + 1);
            }
            
            int count = 0;
            for(int i = 0; i < jarr.length; i++){
                if(hm.containsKey(jarr[i])){
                    count++;
                }
            }

            System.out.println(count);
            hm.clear();
        }
        
        sc.close();
    }
}
