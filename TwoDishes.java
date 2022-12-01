import java.util.Scanner;

public class TwoDishes {
    public static boolean enoughDishes(int count,int N,int A,int B,int C){
        boolean isPossible = false;

        while(A > 0 && B >0){
            A--;
            B--;
            count++;

            isPossible = changeBool(N, count);
            if(isPossible){
                return isPossible;
            } 
        }


        while(B > 0 && C >0){
            B--;
            C--;
            count++;

            isPossible = changeBool(N, count);
            if(isPossible){
                return isPossible;
            } 
        }


        return isPossible;
    }

    public static boolean changeBool(int N,int count){
        if(count == N){
            return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int count = 0;
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();


            if(enoughDishes(count, N, A, B, C)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            T--;
        }

        sc.close();
    }
}
