import java.util.Scanner;

public class EndlessAppetizers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int extraPlates = Z / 30;

            X = X + extraPlates;

            int i = 0;
            int things = 0;
            while (things < X) {
                things += Y;
                i++;
            }

            System.out.println(i);
        }
        sc.close();
    }
}
