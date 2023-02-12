import java.util.Scanner;

public class FarmerAndHisPlot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int M = sc.nextInt();
            int N = sc.nextInt();

            int k = Math.min(M,N);
            int f = 0;
            for(int i = k; i > 0; i--){
                if(M%i == 0 && N%i == 0){
                    f = i;
                    break;
                }
            }

            System.out.println((M/f)*(N/f));
        }
        
        sc.close();
    }
}
