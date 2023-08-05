import java.util.Arrays;
import java.util.Scanner;

public class AdaAndDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int n = sc.nextInt();
            int[] d = new int[n];

            for(int i = 0; i < n; i++) d[i] = sc.nextInt();

            boolean flag = true;

            for(int i = 0; i < n - 1; i++){
                if(d[i] != d[i+1]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println((int)Math.ceil(n/2.0)*d[0]);
            }
            else if(n == 1){
                System.out.println(d[0]);
            }
            else if(n == 2){
                System.out.println((int)Math.max(d[0],d[1]));
            }
            else if(n == 3){
                Arrays.sort(d);
                System.out.println((int)Math.max(d[0] + d[1], d[2]));
            }
            else if(n == 4){
                Arrays.sort(d);
                System.out.println((int)Math.min(Math.max(d[0]+d[3],d[1]+d[2]),Math.max(d[0]+d[1]+d[2],d[3])));
            }
        }
        sc.close();
    }
}
