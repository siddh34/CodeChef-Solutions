import java.util.Scanner;

public class TheBlockGame {
    public static int reverse(int number){
        int reversed = 0;
        int temp = number;

        while(temp > 0){
            int remainder = temp % 10;

            reversed = reversed * 10 + remainder;

            temp = temp / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            if(N == reverse(N)){
                System.out.println("wins");
            }
            else{
                System.out.println("loses");
            }
        }
        
        sc.close();
    }
}
