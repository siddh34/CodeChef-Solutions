import java.util.Scanner;

public class CoinsAndTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            
            int h = 0;
            while(h*(h + 1)/2 < N){
                h++;
            }

            if(h*(h + 1)/2 == N){
                System.out.println(h);
            }
            else{
                System.out.println(h - 1);
            }

        }
        
        sc.close();
    }
}
