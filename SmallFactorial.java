import java.util.Scanner;

public class SmallFactorial {
    public static int getFactorial(int n){
        int factorial = 1;
        
        while(n>0){
            factorial *= n;
            n--;
        }

        return factorial;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            System.out.println(getFactorial(sc.nextInt()));
        }
        
        sc.close();
    }
}
