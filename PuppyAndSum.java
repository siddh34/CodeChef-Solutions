import java.util.Scanner;

public class PuppyAndSum {
    public static int recurssiveSum(int D,int N){
        int sum = 0;

        while(D-->0){
            sum = 0;
            for(int i=0;i<=N;i++){
                sum += i;
            }
            N = sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int D = sc.nextInt();
            int N = sc.nextInt();

            System.out.println(recurssiveSum(D, N));
        }
        
        sc.close();
    }
}
