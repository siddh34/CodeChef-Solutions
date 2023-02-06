import java.util.Scanner;

public class NumberOfRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long m = sc.nextLong();
            Long n = sc.nextLong();
            Long val = (n)*(n+1)*(m)*(m+1) / 4;
            System.out.println(val - (m*n));
        }
        
        sc.close();
    }
}
