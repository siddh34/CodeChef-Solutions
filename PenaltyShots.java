import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PenaltyShots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> penalty = new ArrayList<Integer>();

        while((--T) >= 0){
            int team1 = 0,team2 = 0;
            for(int i = 0; i < 10; i++){
                penalty.add(sc.nextInt());
            }

            for(int i = 0; i < 9; i+=2){
                if(penalty.get(i) == 1){
                    team1++;
                }
            }

            for(int i = 1; i < 10; i+=2){
                if(penalty.get(i) == 1){
                    team2++;
                }
            }

            if(team1 > team2){
                System.out.println(1);
            }
            else if(team2 > team1){
                System.out.println(2);
            }
            else{
                System.out.println(0);
            }

            penalty.clear();
        }
        
        sc.close();
    }
}
