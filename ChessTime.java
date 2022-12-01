import java.util.Scanner;

public class ChessTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();

            System.out.println(N*3);

            T--;
        }

        sc.close();
    }
}
