import java.util.Scanner;

public class RecoverThePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            Integer arr[] = new Integer[N];
            Integer num[] = new Integer[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 1; i <= N; i++){
                num[i-1] = i;
            }

            for(int i = 0; i < N; i++){
                if(arr[i] == 0){
                    num[i+1] = num[i+1] ^ num[i];
                    num[i] = num[i+1] ^ num[i];
                    num[i+1] = num[i+1] ^ num[i];
                }
            }

            for(int i = 0; i < N; i++){
                System.out.print(num[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
