import java.util.Scanner;

public class ChefEren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int even = 0,odd = 0;
            for(int i = 1; i <= N; i++){
                if(i % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }

            System.out.println(even*A+odd*B);
        }
        
        sc.close();
    }    
}