import java.util.Scanner;

public class AGoodSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            int sum = 1;

            for(int i = 0; i <= N; i++){
                System.out.print(sum + " ");
                sum = sum + 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
