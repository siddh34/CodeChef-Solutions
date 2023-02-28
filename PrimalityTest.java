import java.util.Scanner;

public class PrimalityTest{
    public static boolean isPrime(int N) {
        boolean result = false;

        if(N < 2){
            return result;
        }

        
        for(int i = 2; i < Math.sqrt(N); i++){
            if(N % i == 0){
                return result;
            }
        }

        result = true;

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            if(isPrime(N)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
