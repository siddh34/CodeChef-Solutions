import java.util.Scanner;

public class BucketAndWaterFlow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int W = sc.nextInt(); // already filled water
            int X = sc.nextInt(); // max capacity
            int Y = sc.nextInt(); // WATER FILLING AT Y RATE
            int Z = sc.nextInt(); // WATER kept fill for Z hours

            if(Y*Z > (X-W)){
                System.out.println("OVERFLOW");
            }
            else if(Y*Z == (X-W)){
                System.out.println("FILLED");
            }
            else{
                System.out.println("UNFILLED");
            }

        }
        
        sc.close();
    }
}
