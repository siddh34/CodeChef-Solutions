import java.util.Scanner;

public class AlternatingSubarrayPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while ((T--) > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            b[n - 1] = 1;
            for(int i = n - 2; i >= 0; i--){
                int sign = Integer.signum(a[i]) + Integer.signum(a[i+1]);
                if(sign==0){
                    b[i] = b[i+1]+1;
                }
                else{
                    b[i] = 1;
                }
            }

            for(int num: b){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
