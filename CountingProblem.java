import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>(); 
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            int odd = 0;
            for(int i = 0; i < N; i++){
                if(A.get(i) % 2 != 0){
                    odd++;
                }
            }

            if((odd)%2 == 0 && odd > 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            A.clear();
        }
        
        sc.close();
    }
}
