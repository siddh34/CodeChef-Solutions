import java.util.Scanner;

public class CielAndAMinusBProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if((A-B) % 10 == 9){
            System.out.println(A-(B + 1));
        }
        else{
            System.out.println(A - (B - 1));
        }
        sc.close();
    }
}
