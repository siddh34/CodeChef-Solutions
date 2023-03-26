import java.util.Scanner;

public class NewPiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int P = sc.nextInt();
            int Q = sc.nextInt();
            
            if(A == P && B == Q){
                System.out.println(0);
            }
            else if(((A+B) % 2 != 0) && ((P+Q) % 2 != 0) || ((A+B) % 2 == 0) && ((P+Q) % 2 == 0)){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}
