import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximiseTheSubsequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> positiveNumber = new ArrayList<Integer>();
        List<Integer> negativeNumber = new ArrayList<Integer>();
        List<Integer> numbers = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int sum = 0;

            for(int i = 0; i < N; i++){
                numbers.add(sc.nextInt());
            }

            for(int i: numbers){
                if(i > 0){
                    positiveNumber.add(i);
                }
                else{
                    negativeNumber.add(i);
                }
            }

            for(int i: positiveNumber){
                sum += i;
            }

            Collections.sort(negativeNumber);
            for(int i = 0; i < Math.min(K,negativeNumber.size());i++){
                sum += (-1)*negativeNumber.get(i);
            }

            System.out.println(sum);

            //clearing the mess
            positiveNumber.clear();
            negativeNumber.clear();
            numbers.clear();
        }
        
        sc.close();
    }
}
