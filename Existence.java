import java.util.Scanner;

public class Existence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            long x = sc.nextLong();
            long y = sc.nextLong();

            if((x*x*x*x) + (4*y*y) == 4*(x*x)*(y)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
