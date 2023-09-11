import java.util.Scanner;

public class LuigiAndUniformity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            if(N == 1){
                System.out.println(0);
                continue;
            }

            int min = Integer.MAX_VALUE;
            for(int num : arr) min = Math.min(min, num);
            boolean flag = true;
            int count = 0;
            for(int i = 0; i < N; i++){
                if(arr[i]%min!=0){
                    flag = false;
                    break;
                }
                if(arr[i] == min) count++;
            }

            if(flag) System.out.println(N - count);
            else System.out.println(N);
        }
        sc.close();
    }
}
