import java.util.Scanner;

public class ChefAndSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jacketcost = sc.nextInt();
        int sockcost = sc.nextInt();
        int money = sc.nextInt();

        if((((money - jacketcost)/sockcost) % 2 == 0)){
            System.out.println("Lucky Chef");
        }
        else{
            System.out.println("Unlucky Chef");
        }
    
        sc.close();
    }
}
