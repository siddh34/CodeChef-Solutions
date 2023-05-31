import java.util.Scanner;

public class ReturnTheChange {
    public static int roundOfNumber(String number){
        char[] num = number.toCharArray();
        int result = 0;

        
        if(num[num.length - 1] - '0' > 4){
            result += Integer.parseInt(number) + (10 - (num[num.length - 1] - '0'));
        }
        else{
            result += Integer.parseInt(number) - ( (num[num.length - 1] - '0'));
        }

        result = 100 - result;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String N = sc.next();

            System.out.println(roundOfNumber(N));
        }
        
        sc.close();
    }
}
