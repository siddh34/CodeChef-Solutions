import java.util.Scanner;

public class AirHockey {
    public static int getAirHockeyScore(int A,int B){
        int minScore = 0;

        if(A > B){
            minScore = A;
        }
        else{
            minScore = B;
        }

        minScore = 7 - minScore;

        return minScore;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(getAirHockeyScore(A, B));

            T--;
        }

        sc.close();
    }
}
