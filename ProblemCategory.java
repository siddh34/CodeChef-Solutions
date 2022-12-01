import java.util.Scanner;

public class ProblemCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int x = sc.nextInt();
            if(x >= 0 && x < 100){
                System.out.println("Easy");
            }
            else if(x >= 100 && x < 200){
                System.out.println("Medium");
            }
            else if(x >= 200 && x < 300){
                System.out.println("Hard");
            }
            T--;
        }

        sc.close();
    }
}
