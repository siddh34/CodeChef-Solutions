import java.util.Scanner;

public class ExpenseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int salary = (int) Math.pow(2, X);

            for(int i = 0; i < N; i++){
                salary = salary/2;
            }

            System.out.println(salary);
        }
        
        sc.close();
    }
}
