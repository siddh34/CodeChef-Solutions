import java.util.Scanner;

public class TheLastLevels {

    public static int numbMins(int X,int Y,int Z){
        int minutes = 0;

        for(int j = 1; j <= X; j++){
            if(j % 3 == 0 && X > j){
                minutes = minutes + Z;
            }
            minutes = minutes + Y;
        }

        return minutes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            System.out.println(numbMins(X, Y, Z));
            T--;
        }

        sc.close();
    }
}
