import java.util.Scanner;

public class DefeatTheMonster2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            if (y >= x) {
                System.out.println("0");
            } else {
                if (Math.ceil(a / (x - y)) < Math.ceil(b / y)) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            }
        }
        sc.close();
    }
}
