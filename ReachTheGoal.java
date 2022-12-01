import java.util.Scanner;

public class ReachTheGoal {
    
    public static void differentiate(int x, int y) {
        System.out.println(x - y);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int firstTeamScore = sc.nextInt();
            int secondTeamScore = sc.nextInt();
            ReachTheGoal.differentiate(firstTeamScore, secondTeamScore);
            n--;
        }
        sc.close();
    }
}
