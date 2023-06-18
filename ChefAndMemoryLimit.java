import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndMemoryLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Long> M = new ArrayList<Long>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                M.add(sc.nextLong());
            }

            Long sum = M.get(0);
            for(int i = 0; i < N - 1; i++){
                if(M.get(i) < M.get(i+1)){
                    sum += (M.get(i+1) - M.get(i));
                }
            }

            System.out.println(sum);

            M.clear();
        }
        
        sc.close();
    }
}