import java.util.Scanner;

public class MinionChefAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long N = sc.nextLong();
            long H = sc.nextLong();

            long A[] = new long[(int)N];
            long max = 0;
            for(int i = 0; i < N; i++){
                A[i] = sc.nextLong();
                max = Math.max(max, A[i]);
            }

            long left = 1;
            long right = max;
            long ans = -1;

            while(left <= right){
                long mid = left + (right - left) / 2;
                long hr = 0;
                for(long p: A){
                    hr += (p + mid - 1) / mid;
                }

                if(hr <= H){
                    ans = mid;
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
