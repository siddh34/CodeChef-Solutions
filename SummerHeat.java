import java.util.Scanner;

public class SummerHeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();

            System.out.println((Xa/xa) + (Xb/xb));
        }
        
        sc.close();
    }
}
