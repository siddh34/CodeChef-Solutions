import java.util.Scanner;

public class TicketFine {
    public static int getTotalFine(int X,int P,int Q){
        int total = 0;
        
        if(P - Q > 0){
            total = X*(P-Q);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            
            System.out.println(getTotalFine(X, P, Q));
        }
        
        sc.close();
    }
}
