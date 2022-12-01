import java.util.Scanner;

public class Lunchtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int time = sc.nextInt();

            if(time >= 1 && time <= 4){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            T--;
        }

        sc.close();
    }
}
