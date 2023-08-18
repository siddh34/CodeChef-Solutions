import java.util.Scanner;

public class FitInDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(X%(N+1));
        }
        sc.close();
    }
}
