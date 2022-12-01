import java.util.Scanner;

public class WaterRequirement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int hours = sc.nextInt();
            System.out.println(hours*2);
            T--;
        }

        sc.close();
    }
}
