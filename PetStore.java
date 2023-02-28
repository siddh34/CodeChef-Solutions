import java.util.HashMap;
import java.util.Scanner;

public class PetStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 

        while((--T) >= 0){
            int N = sc.nextInt();

            int k = 0;
            for(int i = 0; i <N; i++){
                k = sc.nextInt();
                map.put(k,map.getOrDefault(k, 0) + 1);
            }

            boolean condition = true;
            for(int j: map.keySet()){
                if(map.get(j) % 2 != 0){
                    condition = false;
                }
            }

            if(condition){
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
