import java.util.Scanner;

public class StrongElements {
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
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

            int next[] = new int[N];
            int prev[] = new int[N];
            for(int i = 0; i < N; i++){
                if(i == 0){
                    next[i]=arr[i];
                }
                else{
                    next[i]=gcd(next[i-1],arr[i]);
                }
            }

            for(int i = N-1; i >= 0; i--){
                if(i == N-1){
                    prev[i]=arr[i];
                }
                else{
                    prev[i]=gcd(prev[i+1],arr[i]);
                }
            }

            int count = 0;
            for(int i = 0; i < N; i++){
                if(i == 0){
                    if(prev[i+1]!=1) count++;
                }
                else if(i == N-1){
                    if(next[i-1]!=1) count++;
                }   
                else{
                    if(gcd(next[i-1],prev[i+1])!=1) count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
