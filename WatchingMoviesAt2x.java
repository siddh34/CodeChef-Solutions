import java.util.Scanner;

public class WatchingMoviesAt2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(X -(Y/2));
        
        sc.close();
    }
}
