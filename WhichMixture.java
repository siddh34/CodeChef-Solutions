import java.util.Scanner;

public class WhichMixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A > 0 && B > 0){
                System.out.println("Solution");
            }
            else if(A == 0){
                System.out.println("Liquid");
            }
            else if(B == 0){
                System.out.println("Solid");
            }
        }
        
        sc.close();
    }
}
