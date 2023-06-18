import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeChefStreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> Om = new ArrayList<Integer>();
        List<Integer> Addy = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i=0; i < N; i++){
                Om.add(sc.nextInt());
            }

            for(int i=0; i < N; i++){
                Addy.add(sc.nextInt());
            }

            int currSteakOfOm = 0;
            int maxSteakOfOm = 0;
            for(int i=0; i < N; i++){
                if(Om.get(i) > 0){
                    currSteakOfOm++;
                }

                maxSteakOfOm = Math.max(currSteakOfOm,maxSteakOfOm);
                if(Om.get(i) == 0){
                    currSteakOfOm = 0;
                }
            }

            int currSteakOfAddy = 0;
            int maxSteakOfAddy = 0;
            for(int i=0; i < N; i++){
                if(Addy.get(i) > 0){
                    currSteakOfAddy++;
                }

                maxSteakOfAddy = Math.max(currSteakOfAddy,maxSteakOfAddy);
                if(Addy.get(i) == 0){
                    currSteakOfAddy = 0;
                }
            }

            if(maxSteakOfAddy > maxSteakOfOm){
                System.out.println("Addy");
            }
            else if(maxSteakOfOm > maxSteakOfAddy){
                System.out.println("Om");
            }
            else{
                System.out.println("Draw");
            }

            Om.clear();
            Addy.clear();
        }
        
        sc.close();
    }
}
