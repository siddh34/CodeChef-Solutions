import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CostOfGroceries {
    public static int getCostOfGroceries(List<Integer> freshness,List<Integer> cost,int X){
        int costValue = 0;

        for(int i=0;i<cost.size();i++){
            if(freshness.get(i) >= X){
                costValue += cost.get(i);
            }
        }

        return costValue;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            for(int i = 0; i <N; i++){
                B.add(sc.nextInt());
            }

            System.out.println(getCostOfGroceries(A, B, X));

            A.clear();
            B.clear();
        }
        
        sc.close();
    }
}
