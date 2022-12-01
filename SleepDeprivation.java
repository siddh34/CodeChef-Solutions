import java.util.Scanner;

public class SleepDeprivation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n!=0){
            int X = sc.nextInt();

            if(X >= 7){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

            n--;
        }

        sc.close();
    }
}
