import java.util.Scanner;

public class SmallestNumbersOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int A = N % 100;
            int B = A % 50;
            int C = B % 10;
            int D = C % 5;
            int E = D % 2;

            System.out.println((N/100)+(A/50)+(B/10)+(C/5)+(D/2)+E);
        }
        sc.close();
    }
}
