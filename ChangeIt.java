import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChangeIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<Integer,Integer> A = new HashMap<>(); 
        while((--T) >= 0){
            int N = sc.nextInt();

            int k = 0;
            for(int i = 0; i < N; i++){
                k = sc.nextInt();
                A.put(k,A.getOrDefault(k, 0) + 1);
            }

            int max = -1;

            for(int j: A.keySet()){
                if(max < A.get(j)){
                    max = A.get(j);
                }
            }

            System.out.println(N - max);

            A.clear();
        }
        
        sc.close();
    }
}
