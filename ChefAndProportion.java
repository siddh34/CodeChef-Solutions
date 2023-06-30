import java.util.Scanner;

public class ChefAndProportion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(a*d == c*b || c*d == a*b || a*c == b*d){
            System.out.println("Possible");
        }
        else{
            System.out.println("Impossible");
        }

        sc.close();
    }
}
