import java.util.Scanner;

public class ChefAndWaterBottles {

    public static int getFilledBottles(int N,int X,int K){
        int filled = 0;

        for(int i = 1; i <= N; i++){
            if(i*X <= K){
                filled = i;
            }
        }

        return filled;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(getFilledBottles(N, X, K));
            T--;
        }

        sc.close();
    }
}
