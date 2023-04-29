import java.util.Scanner;

public class AIAnalysingCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();

        if(X <= 1000){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        sc.close();
    }
}