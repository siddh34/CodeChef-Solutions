import java.util.Scanner;

public class ThreeWayCommunications {
    public static double distance(float x1, float y1,float x2, float y2) {
        double dist = 0;
        
        double xd = Math.abs(x1 - x2);
        double yd = Math.abs(y1 - y2);

        dist = Math.sqrt((xd*xd) + (yd*yd));

        return dist;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float r = sc.nextFloat();

            float x1 = sc.nextFloat();
            float y1 = sc.nextFloat();

            float x2 = sc.nextFloat();
            float y2 = sc.nextFloat();

            float x3 = sc.nextFloat();
            float y3 = sc.nextFloat();

            double d1 = distance(x1, y1, x2, y2);
            double d2 = distance(x2, y2, x3, y3);
            double d3 = distance(x3, y3, x1, y1);

            if((d1 <= r && d2 <= r) || (d2 <= r && d3 <= r) || (d3 <= r && d1 <= r)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}