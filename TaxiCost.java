import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> D = new ArrayList<Integer>();

        while((--T) >= 0){
            Long N = sc.nextLong();
            Long X = sc.nextLong();
            Long totalCost = (long) 0;

            for(int i = 0; i <N; i++){
                D.add(sc.nextInt());
            }

            for(int i = 0; i < N; i++){
                if((D.get(i) == 1) || (i != 0 && D.get(i - 1) == 1)){
                    totalCost += X*2;
                }
            }

            System.out.println(totalCost);
        }
        
        sc.close();
    }
}
