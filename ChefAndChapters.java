import java.util.Scanner;

public class ChefAndChapters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            System.out.println(X*Y*Z);
            T--;
        }

        sc.close();
    }
}
