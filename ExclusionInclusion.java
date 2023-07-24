import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExclusionInclusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            Long arr[] = new Long[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr, Collections.reverseOrder());

            Long[] sum = new Long[N];

            sum[0] = arr[0];
            for(int i = 1; i < N; i++){
                sum[i] = arr[i]+sum[i - 1];
            }

            Arrays.sort(sum,Collections.reverseOrder());

            for(Long i: sum){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
