import java.util.Scanner;

public class BathInWinters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int k = 0;
            
            for(int i = -1; 2*i*X <= N;i++){ k = i; }

            System.out.println(k);
        }
        
        sc.close();
    }
}
