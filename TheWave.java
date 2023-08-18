import java.util.Arrays;
import java.util.Scanner;

public class TheWave {
    public static int binarySearch(int arr[],int n,int k){
        int ans = n;
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == k){
                return -1;
            }
            else if(arr[mid] > k){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);
        while(Q-->0){
            int a = sc.nextInt();
            if(binarySearch(A, N, a) == -1){
                System.out.println("0");
            }
            else if(N % 2 == 0 && binarySearch(A, N, a) % 2 == 0){
                System.out.println("POSITIVE");
            }
            else{
                System.out.println("NEGATIVE");
            }
        }

        sc.close();
    }
}
