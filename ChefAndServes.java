import java.util.Scanner;

public class ChefAndServes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int K = sc.nextInt();

            int chance = (p1 + p2) / K;

            if(chance % 2 == 0){
                System.out.println("CHEF");
            }
            else{
                System.out.println("COOK");
            }
        }
        
        sc.close();
    }
}
