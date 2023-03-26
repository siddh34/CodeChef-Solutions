import java.util.Scanner;

public class DigitSumParities {
    public static int digitSum(int n){
        int sum = 0;

        int digit = 0;
        int temp = n;

        while(temp > 0){
            digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int sum = digitSum(N);

            if(sum % 2 == 0){
                while(sum % 2 == 0){
                    N = N + 1;
                    sum = digitSum(N);
                }
            }
            else if(sum % 2 != 0){
                while(sum % 2 != 0){
                    N = N + 1;
                    sum = digitSum(N);
                }
            }

            System.out.println(N);
        }
        
        sc.close();
    }
}
