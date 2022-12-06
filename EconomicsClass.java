import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EconomicsClass {
    public static int findBalance(List<Integer> A,List<Integer> B){
        int count = 0;

        for(int i = 0; i < A.size(); i++){
            if(A.get(i).equals(B.get(i))){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> supply = new ArrayList<Integer>();
        List<Integer> demand = new ArrayList<Integer>();

        while((--T) >= 0){
            int X = sc.nextInt();
            
            for(int i = 0; i < X; i++){
                supply.add(sc.nextInt());
            }

            for(int i = 0; i < X; i++){
                demand.add(sc.nextInt());
            }

            System.out.println(findBalance(demand, supply));

            demand.clear();
            supply.clear();
        }
        
        sc.close();
    }
}
