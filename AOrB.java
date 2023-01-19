import java.util.Scanner;

public class AOrB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println(Math.max((500 - X*2) + (1000 - (X+Y)*4),(1000 - Y*4) + (500 - (X+Y)*2)));
        }
        
        sc.close();
    }
}
