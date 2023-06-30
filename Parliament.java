import java.util.Scanner;

public class Parliament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            double N = sc.nextInt();
            double X = sc.nextInt();

            if((N/2) <= X){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
