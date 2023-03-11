import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EqualElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<Integer,Integer> A = new HashMap<Integer,Integer>(); 
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                int j = sc.nextInt();
                A.put(j,A.getOrDefault(j,0) + 1);
            }

            int max = 0;
            for(int k: A.keySet()){
                if(max < A.get(k)){
                    max = A.get(k);
                }
            }

            System.out.println(N - max);

            A.clear();
        }
        
        sc.close();
    }
}
