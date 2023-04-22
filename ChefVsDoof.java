import java.util.Scanner;

public class ChefVsDoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T) >= 0){
            int N = sc.nextInt();

            int mult = 1;
            for(int i = 0; i < N; i++){
                mult *= sc.nextInt();
            }

            if(mult % 2 == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
        
        sc.close();
    }
}
