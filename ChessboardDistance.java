import java.util.Scanner;

public class ChessboardDistance {

    public static int getDistance(int X1, int Y1, int X2, int Y2){
        int distance = 0;
        int diffX = Math.abs(X1 - X2);
        int diffY = Math.abs(Y1 - Y2);

        if(diffX > diffY){
            distance = diffX;
        }
        else{
            distance = diffY;
        }

        return distance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            System.out.println(getDistance(X1, Y1, X2, Y2));

            T--;
        }

        sc.close();
    }
}
