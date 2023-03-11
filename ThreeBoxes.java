import java.util.Scanner;

public class ThreeBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();

            if(A+B+C<=D){
                System.out.println(1);
            }
            else if(A+B<=D){
                System.out.println(2);
            }
            else{
                System.out.println(3);
            }
        }
        
        sc.close();
    }
}
