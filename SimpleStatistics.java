import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SimpleStatistics {
    public static float getAvg(List<Float> values,int K) {
        float avg = 0;

        Collections.sort(values);
        if(K == 0){
            for(int i = 0; i < values.size(); i++){
                avg += values.get(i);
            }
            avg /= values.size();
        }
        else{
            values.remove(K - 1);
            Collections.reverse(values);
            values.remove(K - 1);
            for(float j: values){
                avg += j;
            }
            avg /= values.size();
        }

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Float> numbers = new ArrayList<Float>();

        while((--T) >= 0){
            float N = sc.nextFloat();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                numbers.add(sc.nextFloat());
            }

            System.out.printf("%.6f\n",getAvg(numbers, K));
            numbers.clear();
        }
        
        sc.close();
    }
}
