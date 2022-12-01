import java.util.Scanner;

public class Hackerman {
    public static boolean isPrime(int number){
        boolean prime = false;
        int temp = 0;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0){
                temp++;
                break;
            }
        }

        if(temp == 0){
            prime = true;
        }

        return prime;
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(isPrime(A+B)){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
            T--;
        }

        sc.close();
    }
}
