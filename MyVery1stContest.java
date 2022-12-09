import java.util.Scanner;

public class MyVery1stContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print(N-A+" ");
        System.out.println(N - A - B);
        sc.close();
    }
}
