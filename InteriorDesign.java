import java.util.Scanner;

public class InteriorDesign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X1 = sc.nextInt();
            int Y1 = sc.nextInt();
            int X2 = sc.nextInt();
            int Y2 = sc.nextInt();

            if(X1 + Y1 > X2 + Y2){
                System.out.println(X2+Y2);
            }
            else{
                System.out.println(X1+Y1);
            }

        }
        
        sc.close();
    }
}
