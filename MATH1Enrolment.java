import java.util.Scanner;

public class MATH1Enrolment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(X >= Y){
                System.out.println(0);
            }
            else{
                System.out.println(Y - X);
            }

            T--;
        }

        sc.close();
    }
}
