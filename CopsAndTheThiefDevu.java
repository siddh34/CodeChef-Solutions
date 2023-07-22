import java.util.Scanner;

public class CopsAndTheThiefDevu {
    public static void isSafe(boolean H[],int s,int e){
        s = Math.max(s,1);
        e = Math.min(e,100);
        for(int i = s; i <= e; i++){
            H[i - 1] = true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int M = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int search = x * y;

            boolean H[] = new boolean[100];

            for(int i = 0; i < M; i++){
                int p = sc.nextInt();
                isSafe(H, p - search,p + search);
            }

            int count = 0;
            for(int i = 0; i < 100; i++){
                if(!H[i]){
                    count++;
                }
            }

            System.out.println(count);
        }
        sc.close();
    }
}
