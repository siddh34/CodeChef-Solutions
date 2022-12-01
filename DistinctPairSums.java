import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistinctPairSums {
    public static int FreqOfDistinctPair(List<Integer> range){
        int freq = 0;
        int sum = 0;
        List<Integer> record = new ArrayList<Integer>();
        for(int i: range){
            for(int j: range){
                sum = i + j;
                if(!record.contains(sum)){
                    record.add(sum);
                    freq++;
                }
                sum = 0;
            }
        }
        record.clear();
        return freq;
    }


    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> range = new ArrayList<Integer>();

        while((--T) >= 0){
            int L = sc.nextInt();
            int R = sc.nextInt();

            for(int i = L; i <= R; i++){
                range.add(i);
            }

            System.out.println(FreqOfDistinctPair(range));
            range.clear();
        }
        
        sc.close();
    }
}
