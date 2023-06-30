import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MAKEAANDBEQUALL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Long> A = new ArrayList<Long>();
        List<Long> B = new ArrayList<Long>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                A.add(sc.nextLong());
            }

            for(int i=0; i<N; i++){
                B.add(sc.nextLong());
            }

            long count1 = 0;
            long count2 = 0;
            for(int i=0; i<N; i++){
                if(A.get(i) > B.get(i)){
                    count1 += A.get(i) - B.get(i);
                }
                else if(A.get(i) < B.get(i)){
                    count2 += B.get(i) - A.get(i);
                }
            }

            if(count1 == count2){
                System.out.println(count1);
            }
            else{
                System.out.println(-1);
            }

            A.clear();
            B.clear();
        }
        
        sc.close();
    }
}