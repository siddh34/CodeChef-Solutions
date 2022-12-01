import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mario {
    List<String> stage = new ArrayList<String>();

    public String getStageName(int presentStage){
        stage.add("NORMAL");
        stage.add("HUGE");
        stage.add("SMALL");
        String s = "NORMAL";

        int j = 0;
        for(int i = 0; i <= presentStage; i++){
            if(i % 3 == 0){
                j = 0;
            }
            s = stage.get(j);
            j++;
        }

        stage.clear();

        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        Mario mario = new Mario();
        
        while(T!=0){
            int wantedStage = sc.nextInt();
            System.out.println(mario.getStageName(wantedStage));
            T--;
        }

        sc.close();
    }
}
