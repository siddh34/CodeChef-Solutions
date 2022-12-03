import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SimpleStatistics {
    public static double getAvg(List<Float> values,int K,int N) {
        double avg = 0;

        Collections.sort(values);
        
        for(int i = (int) K; i < N - K; i++) {
            avg += values.get(i);
        }

        avg /= (N-2*K);

        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Float> numbers = new ArrayList<Float>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                numbers.add(sc.nextFloat());
            }

            System.out.println(String.format("%.6f", getAvg(numbers, K, N)));
            numbers.clear();
        }
        
        sc.close();
    }
}
