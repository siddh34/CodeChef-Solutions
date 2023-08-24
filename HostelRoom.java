import java.util.Scanner;

public class HostelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int arr[] = new int[N];
            int maximum = X;
            int sum = X;
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
                maximum = Math.max(maximum,sum);
            }

            System.out.println(maximum);
        }
        sc.close();
    }
}