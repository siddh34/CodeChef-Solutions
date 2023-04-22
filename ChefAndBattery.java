import java.util.Scanner;

public class ChefAndBattery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int count = 0;
            while(N > 50 || N < 50){
                if(N > 50){
                    N = N - 3;
                    count++;
                }
                else if(N < 50){
                    N = N + 2;
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
