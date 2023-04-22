import java.util.Scanner;

public class BudgetOfTechnex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int R = sc.nextInt();

            System.out.println(R * 100);
        }
        
        sc.close();
    }
}
