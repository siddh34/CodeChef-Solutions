import java.util.Scanner;

public class RichieRich {

    public static int getNumberOfyear(int A,int B,int X){
        int year = (B - A)/X;
        return year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();

            System.out.println(getNumberOfyear(A, B, X));

            T--;
        }

        sc.close();
    }
}
