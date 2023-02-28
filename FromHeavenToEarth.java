import java.util.Scanner;

public class FromHeavenToEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            float V1 = sc.nextFloat();
            float V2 = sc.nextFloat();

            float t1 = (float) ((float) N*Math.pow(2,0.5)/V1);
            float t2 = (float) ((float) N*Math.pow(2,1)/V2);

            if(t1 < t2){
                System.out.println("Stairs");
            }
            else if(t1 > t2){
                System.out.println("Elevator");
            }
            else{
                System.out.println("Both");
            }
        }
        
        sc.close();
    }
}
