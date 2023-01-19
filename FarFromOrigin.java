import java.util.Scanner;

public class FarFromOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Float X1 = sc.nextFloat();
            Float Y1 = sc.nextFloat();
            Float X2 = sc.nextFloat();
            Float Y2 = sc.nextFloat();

            Float d1 = (float) (Math.pow(X1, 2) + Math.pow(Y1, 2));
            Float d2 = (float) (Math.pow(X2, 2) + Math.pow(Y2, 2));

            if(d1 < d2){
                System.out.println("BOB");
            }
            else if(d2 < d1){
                System.out.println("ALEX");
            }
            else{
                System.out.println("EQUAL");
            }

        }
        
        sc.close();
    }
}
