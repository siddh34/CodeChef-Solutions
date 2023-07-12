import java.util.Scanner;

public class ChefAndPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            if(N % 2 == 0){
                for(int i = 0; i < N/2; i++){
                    System.out.print("10");
                }
            }
            else{
                System.out.print("-1");
            }

            System.out.println();
        }
        
        sc.close();
    }
}
