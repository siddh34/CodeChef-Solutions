import java.util.Arrays;
import java.util.Scanner;

public class Chopsticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Long arr[] = new Long[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        int pairs = 0;
        for(int i = 0; i < N - 1; i++){
            if(arr[i + 1] - arr[i] <= K){
                pairs++;
                i++;
            }
        }

        System.out.println(pairs);
        sc.close();
    }
}
