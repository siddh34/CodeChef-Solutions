import java.util.Scanner;

public class SastaSharkTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            

            if(A*10 > B*5){
                System.out.println("FIRST");
            }
            else if(A*10 < B*5){
                System.out.println("SECOND");
            }
            else{
                System.out.println("ANY");
            }
        }
        
        sc.close();
    }
}
