import java.util.Arrays;
import java.util.Scanner;

public class BallDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();
        
            int[] arr = new int[M];

            for(int i = 0; i < M; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int sum = 0;
            for(int i : arr){
                sum += i;
            }

            int boxes[] = new int[N];

            int mod = sum % N;
            int avg = sum / N;

            Arrays.fill(boxes,avg);
            for(int i = 0; i < N; i++){
                if(mod>0){
                    boxes[i] += 1;
                }
                else{
                    break;
                }
                mod--;
            }

            int ans = 0;
            for(int i : boxes){
                if(i == M) ans++;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
