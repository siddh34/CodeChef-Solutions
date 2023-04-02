import java.util.Scanner;

public class ChefAndCoupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while((--T) >= 0){
            int C = sc.nextInt();
            int D = sc.nextInt();
            
            int[] A = new int[3];
            int[] B = new int[3];

            int day1 = 0,day2 = 0;

            for(int i = 0; i < 3; i++){
                A[i] = sc.nextInt();
                day1 += A[i];
            }
            
            for(int i = 0; i < 3; i++){
                B[i] = sc.nextInt();
                day2 += B[i];
            }

            int day1withdelivery = day1 + D;
            int day2withdelivery = day2 + D;

            int x = (day1 < 150) ? day1withdelivery : day1;
            int y = (day2 < 150) ? day2withdelivery : day2;

            int totalvaluewithcoupon = x + y + C;
            int totalvaluewithoutcoupon = day1withdelivery + day2withdelivery;

            if(totalvaluewithcoupon >= totalvaluewithoutcoupon){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
