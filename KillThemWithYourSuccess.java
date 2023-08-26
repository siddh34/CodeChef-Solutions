import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KillThemWithYourSuccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            double arr[] = new double[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextDouble();
            }

            double res = 0;
            PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

            for(double i: arr){
                pq.add(i);
            }

            while(pq.size() != 1){
                double a = pq.poll();
                double b = pq.poll();

                res = (a+b)/2;

                pq.add(res);
            }

            System.out.printf("%.8f\n",res);
        }
        sc.close();
    }
}
