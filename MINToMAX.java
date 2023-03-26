import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MINToMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            Collections.sort(A);

            int freq = Collections.frequency(A, A.get(0));

            System.out.println(A.size() - freq);

            A.clear();
        }
        
        sc.close();
    }
}
