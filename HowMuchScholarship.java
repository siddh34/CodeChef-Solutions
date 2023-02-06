import java.util.Scanner;

public class HowMuchScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(1 <= N && N <= 50){
            System.out.println(100);
        }
        else if(51 <= N && N <= 100){
            System.out.println(50);
        }
        else{
            System.out.println(0);
        }

        sc.close();
    }
}
