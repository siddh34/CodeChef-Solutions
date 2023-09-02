import java.util.HashMap;
import java.util.Scanner;

public class ChefAndAppleTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int i = 0; i < N; i++){
                int k = sc.nextInt();
                map.put(k,map.getOrDefault(k,0)+1);
            }

            System.out.println(map.size());
        }
        sc.close();
    }
}
