import java.util.Scanner;

public class GoodProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            if(X % 4 == 0){
                System.out.println("Good");
            }
            else{
                System.out.println("Not Good");
            }
        }
        
        sc.close();
    }
}
