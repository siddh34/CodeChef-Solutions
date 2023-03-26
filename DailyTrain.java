import java.util.Scanner;

public class DailyTrain {
    public static int factorial(int n){
        int prod = 1;

        for(int i = 1; i <= n; i++){
            prod *= i;
        }

        return prod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int N = sc.nextInt();

        int possibleWays = 0;

        for(int x = 0; x < N; x++){
            String S = sc.next();
            int remainingSeat = 0,j = 53, k = 0;
            for(int i = 0; i < 9; i++){
                int r1 = 4, r2 = 2;
                while(r1-- >0){
                    if(S.charAt(k) == '0'){
                        remainingSeat++;
                    }
                    k++;
                }

                while(r2-- >0){
                    if(S.charAt(j) == '0'){
                        remainingSeat++;
                    }
                    j--;
                }

                if(X<=remainingSeat){
                    int tempWays = ((factorial(remainingSeat))/((factorial(X)*factorial(remainingSeat-X))));
                    possibleWays += tempWays;
                }

                remainingSeat = 0;
            }
        }
        System.out.println(possibleWays);
        sc.close();
    }
}
