import java.util.Scanner;

public class XJumps {
    public static void calculateSteps(int X, int Y){
        if(X < Y){
            System.out.println(X);
        }
        else{
            System.out.println((X/Y)+(X%Y));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            XJumps.calculateSteps(X, Y);
            n--;
        }
        sc.close();
    }
}
