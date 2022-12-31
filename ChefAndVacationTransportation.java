import java.util.Scanner;

public class ChefAndVacationTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if(X + Y < Z){
                System.out.println("PLANEBUS");
            }
            else if (X + Y > Z){
                System.out.println("TRAIN");
            }
            else{
                System.out.println("EQUAL");
            }
        }
        
        sc.close();
    }
}
