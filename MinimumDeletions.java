import java.util.Scanner;

public class MinimumDeletions {
    public static int gcd(int a,int b){
        if(b == 0) return a;

        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int arr[] = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            if (N == 2){
                int g = gcd(arr[0],arr[1]);

                if(g == 1){
                    System.out.println(0);
                }
                else if(g > 1){
                    System.out.println(-1);
                }
            }
            else{
                int g = gcd(arr[0],arr[1]);

                for(int i = 2; i < N; i++){
                    g = gcd(arr[i],g);
                }

                if(g == 1){
                    System.out.println(0);
                }
                else{
                    System.out.println(-1);
                }
            }
        }
        sc.close();
    }
}
