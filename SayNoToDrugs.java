import java.util.Scanner;

public class SayNoToDrugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt() - 1;

            int[] arr = new int[N];

            int max = Integer.MIN_VALUE;
            for(int i = 0; i < N-1; i++) {
                arr[i] = sc.nextInt();

                if(max < arr[i]){
                    max = arr[i];
                }
            }

            int friend = sc.nextInt();

            if(friend > max || friend + K * L > max){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        sc.close();
    }
}
