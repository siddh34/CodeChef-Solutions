import java.util.Scanner;

public class SheokandAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long N = sc.nextLong();

            long arr[] = new long[32];
            for(int i = 0; i < 32; i++){
                arr[i] = (long)Math.pow(2,i);
            }

            long diff = Integer.MAX_VALUE;
            for(int i = 0; i < 32; i++){
                for(int j = i + 1; j < 32; j++){
                    long x = arr[i] + arr[j];
                    diff = Math.min(diff, Math.abs(N - x));
                }
            }

            System.out.println(diff);
        }
        sc.close();
    }
}
