import java.util.Scanner;

public class PossibleVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int O = sc.nextInt();
        int C = sc.nextInt();

        int remainingOvers = 20 - O;
        int remainingRuns = R - C;

        if(remainingOvers*36 > remainingRuns){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        sc.close();
    }
}
