import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Long> A = new ArrayList<Long>();
        while((--T)>=0){
            long N = sc.nextLong();

            for(int i = 0; i < N; i++){
                A.add(sc.nextLong());
            }

            long countP = 0;
            long countN = 0;
            for(int i = 0; i < A.size(); i++){
                if(A.get(i) > 0){
                    countP++;
                }
                else if(A.get(i) < 0){
                    countN++;
                }
            }

            System.out.println(((countP*(countP-1))/2)+((countN*(countN-1))/2));

            A.clear();
        }
        
        sc.close();
    }
}
