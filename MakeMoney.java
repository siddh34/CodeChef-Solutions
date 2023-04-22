import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> A = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int C = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            int cost = 0;
            for(int i = 0; i < N;i++){
                if(A.get(i) + C < X){
                    A.set(i,X);
                    cost += C;
                }
            }
            
            int sum = 0;
            for(int i = 0; i < N; i++){
                sum += A.get(i);
            }

            System.out.println(sum - cost);

            A.clear();
        }
        
        sc.close();
    }
}
