import java.util.Scanner;

public class FavouriteNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int n = sc.nextInt();

            if(n % 7 == 0 && n % 2 == 0){
                System.out.println("Alice");
            }
            else if(n % 9 == 0 && n % 2 != 0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Charlie");
            }
        }
        
        sc.close();
    }
}
