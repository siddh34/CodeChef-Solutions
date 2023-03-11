import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunningComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            for(int i = 0; i < N; i++){
                B.add(sc.nextInt());
            }

            int count = 0;
            for(int i = 0; i < N; i++){
                if(A.get(i) > 2*B.get(i) || B.get(i) > 2*A.get(i)){ 
                    continue;
                }
                else{
                    count++;
                }
            }

            System.out.println(count);

            A.clear();
            B.clear();
        }
        
        sc.close();
    }
}
