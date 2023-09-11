import java.util.Scanner;

public class DivisibleAndNotDivisible {
    public static long test(long X,long Y,long Z){
        if(Y % Z == 0){
            return -1;
        }
        long K = X + 1;

        if(!(K % Y == 0)){
            K = K + Y - (K % Y);
        }

        while(K % Z == 0){
            K += Y;
        }

        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long X = sc.nextLong();
            long Y = sc.nextLong();
            long Z = sc.nextLong();

            System.out.println(test(X,Y,Z));
        }
        sc.close();
    }
}
