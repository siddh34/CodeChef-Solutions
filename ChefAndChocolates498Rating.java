import java.util.Scanner;

public class ChefAndChocolates498Rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            System.out.println((X - Y)*Z);
        }
        
        sc.close();
    }   
}