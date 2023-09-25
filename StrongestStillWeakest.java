import java.util.Arrays;
import java.util.Scanner;

public class StrongestStillWeakest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[][] = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int weak[] = new int[M];
        for(int i = 0; i < M; i++){
            weak[i] = arr[0][i];
        }

        
        int strong[] = new int[N];
        for(int i = 0; i < N; i++){
            int str = arr[i][0];
            for(int j = 0; j < M; j++){
                str = Math.max(str,arr[i][j]);
                weak[j] = Math.min(weak[j], arr[i][j]);
            }
            strong[i] = str;
        }
        
        Arrays.sort(strong);
        for(int i: weak){
            if(Arrays.binarySearch(strong,i) >= 0){
                System.out.println("Yes");
                sc.close();
                return;
            }
        }

        System.out.println("NO");

        sc.close();
    }
}
