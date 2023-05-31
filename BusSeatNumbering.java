import java.util.Scanner;

public class BusSeatNumbering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int n = sc.nextInt();

            if(1 <= n && n <= 10){
                System.out.println("Lower Double");
            }
            else if(11 <= n && n <= 15){
                System.out.println("Lower Single");
            }
            else if(16 <= n && n <= 25){
                System.out.println("Upper Double");
            }
            else{
                System.out.println("Upper Single");
            }
        }
        
        sc.close();
    }
}
