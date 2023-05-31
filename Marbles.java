import java.util.Scanner;

public class Marbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            long sum = 1;

            for(long i = 1; i < k; i++) {
                sum = sum*((n-k)+i)/i;
            }

            System.out.println(sum);
        }
        
        sc.close();
    }
}
