import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> withDrawAmount = new ArrayList<Integer>();
        List<Integer> record = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                withDrawAmount.add(sc.nextInt());
            }

            for(int i: withDrawAmount){
                if(i <= K){
                    K -= i;
                    record.add(1);
                }
                else{
                    record.add(0);
                }
            }

            for(int i: record){
                System.out.print(i);
            }
            System.out.println();

            withDrawAmount.clear();
            record.clear();
        }
        
        sc.close();
    }
}
