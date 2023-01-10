import java.util.Scanner;

public class ThreeNumberExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long A = sc.nextLong();
            Long B = sc.nextLong();
            Long C = sc.nextLong();

            if(A + B + C == 0 || A - B - C == 0 || A + B - C == 0 || (-A) + B + C == 0 || A - B + C == 0 || (-A) + B - C == 0 || (-A) - B + C == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
