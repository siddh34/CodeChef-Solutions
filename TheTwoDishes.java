import java.util.Scanner;

public class TheTwoDishes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();
            int S = sc.nextInt();

            if(S>=N){
                System.out.println((2*N)-S);
            }
            else{
                System.out.println(S);
            }

            T--;
        }

        sc.close();
    }
}
