import java.util.Scanner;

public class FarmerFeb {

    static int i = 2;

    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            i = 2;
            return false;
        }

        if(n == i){
            i = 2;
            return true;
        }
        
        if(n % i == 0){
            i = 2;
            return false;
        }
        i++;

        return isPrime(n);
    }

    public static int closetPrimeNumebr(int num){
        int ans = 0;
        
        while(true){
            num++;
            if(isPrime(num)){
                ans = num;
                break;
            }
        }

        return ans;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int closestPrime = closetPrimeNumebr(X+Y);

            System.out.println(closestPrime - (X + Y));
        }
        
        sc.close();
    }
}
