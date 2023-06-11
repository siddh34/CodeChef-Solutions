import java.util.Scanner;

public class RectangularTiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int l = sc.nextInt();
            int b = sc.nextInt();

            if((l*b)%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
