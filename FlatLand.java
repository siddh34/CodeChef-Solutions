import java.util.Scanner;

public class FlatLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            long N = sc.nextLong();

            long count = 0;
            while(N > 0){
                count++;
                long sqrt = (long) Math.floor(Math.sqrt(N));
                N -= sqrt*sqrt;
            }
            System.out.println(count);
            
        }
        
        sc.close();
    }
}
