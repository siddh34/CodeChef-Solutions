import java.util.Scanner;

public class DrumpfForPresident {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while((--T)>=0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            
            int arr[] = new int[N+1];
            for(int i = 1; i <= N; i++){
                arr[i] = sc.nextInt();
            }

            int count[] = new int[N + 1];
            for(int i = 1; i <= N; i++){
                if(arr[i] == i){
                    count[arr[i]] = Integer.MIN_VALUE;
                }
                count[arr[i]]++;
            }

            int vote = 0;
            for(int i = 1; i <= N; i++){
                if(count[i] >= K){
                    vote++;
                }
            }

            System.out.println(vote);
        }
        
        sc.close();
    }
}
