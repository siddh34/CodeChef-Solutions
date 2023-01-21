import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MutatedMinions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> minionsCharacteristics = new ArrayList<Integer>();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            for(int i = 0; i < N; i++){
                minionsCharacteristics.add(sc.nextInt() + K);
            }

            int wolerineCount = 0;
            for(int i = 0; i < minionsCharacteristics.size(); i++){
                if(minionsCharacteristics.get(i) % 7 == 0){
                    wolerineCount++;
                }
            }

            System.out.println(wolerineCount);

            minionsCharacteristics.clear();
        }
        
        sc.close();
    }
}
