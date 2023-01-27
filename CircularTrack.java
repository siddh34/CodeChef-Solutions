import java.util.Scanner;

public class CircularTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int M = sc.nextInt();

            int diff = Math.abs(A - B);

            if(diff > (M/2)){
                System.out.println(M - diff);
            }
            else{
                System.out.println(diff);
            }
        }
        
        sc.close();
    }
}
