import java.util.Scanner;

public class CarsAndBikes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int i = 0; 
            for(i = 0; i*4 <= N; i++){}

            int tyreLeft = N - (i - 1)*4;

            int bikes = 0;
            if(tyreLeft <= 0){
                bikes = 0;
            }
            else{
                if(tyreLeft % 2 == 0){
                    bikes = 1;
                }
            }

            if(bikes == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
