import java.util.Scanner;

public class MonthlyBudget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X >= Y*30){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
