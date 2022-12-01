import java.util.Scanner;

public class PassOrFail {
    
    public static int TotalMarks(int N,int X){
        int marks = X*3 - (N-X);
        return marks;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int P = sc.nextInt();

            int M = TotalMarks(N, X);

            if(M < P){
                System.out.println("FAIL");
            }
            else{
                System.out.println("PASS");
            }
        }
        
        sc.close();
    }
}
