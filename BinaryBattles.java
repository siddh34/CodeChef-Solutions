import java.util.Scanner;

public class BinaryBattles {
    public static int calTime(int N,int A,int B){
        int time = 0;

        while(N > 2){
            time = time + A + B;
            N = N/2;
        }

        time = time + A;

        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T) >= 0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(calTime(N, A, B));
        }
        
        sc.close();
    }
}
