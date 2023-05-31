import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int h = sc.nextInt();

        System.out.println(y*(h-1)+x);

        sc.close();
    }
}
