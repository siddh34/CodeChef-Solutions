import java.util.Scanner;

public class ChefAndCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            if((N - X) < 0){
                System.out.println(0);
            }
            else{
                int i = 0;
                while((N - X) > i*4){
                    i++;
                }
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
