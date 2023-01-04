import java.util.Scanner;

public class ChefAndContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();

            if(X+(P*10) > Y + (Q*10)){
                System.out.println("Chefina");
            }
            else if(X+(P*10) < Y + (Q*10)){
                System.out.println("Chef");
            }
            else{
                System.out.println("Draw");
            }
        }
        
        sc.close();
    }
}
