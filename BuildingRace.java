import java.util.Scanner;

public class BuildingRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if((A/X) > (B/Y)){
                System.out.println("Chefina");
            }
            else if((A/X) < (B/Y)){
                System.out.println("Chef");
            }
            else{
                System.out.println("Both");
            }
        }
        sc.close();
    }
}
