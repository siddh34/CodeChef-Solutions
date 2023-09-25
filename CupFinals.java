import java.util.Scanner;

public class CupFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int D = sc.nextInt();

            if(Math.abs(X-Y) <= D){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
