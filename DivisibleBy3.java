import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            int operations = 0;
            while(A % 3 != 0 && B % 3 != 0){
                if(A > B){
                    A = Math.abs(A - B);
                }
                else{
                    B = Math.abs(B - A);
                }
                operations++;
            }

            System.out.println(operations);
        }
        
        sc.close();
    }
}
