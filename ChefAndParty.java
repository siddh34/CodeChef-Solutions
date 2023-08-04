import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChefAndParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        while(T-->0){
            int N = sc.nextInt();
            
            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            Collections.sort(A);

            for(int j = 0; j < N; j++){
                int k = A.get(j);
                if(B.size()>= k){
                    B.add(k);
                }
            }

            System.out.println(B.size());

            A.clear();
            B.clear();
        }
        sc.close();
    }
}
