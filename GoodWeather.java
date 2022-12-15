import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodWeather {
    public static int weatherCondition(List<Integer> days){
        int condition = 0;
        int sunnyDays = 0;
        int rainyDays = 0;

        for(int i: days){
            if(i == 1){
                sunnyDays++;
            }
            else{
                rainyDays++;
            }
        }

        if(sunnyDays > rainyDays){
            condition = 1;
        }
        else{
            condition = 0;
        }

        return condition;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> days = new ArrayList<Integer>();

        while((--T) >= 0){
            for(int i = 0; i < 7; i++){
                days.add(sc.nextInt());
            }

            if(weatherCondition(days) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            days.clear();
        }
        
        sc.close();
    }
}
