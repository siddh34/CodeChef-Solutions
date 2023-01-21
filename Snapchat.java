import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snapchat {
    public static int streakCounter(List<Integer> Record1,List<Integer> Record2){
        int streak = 0;
        int maximum = 0;

        for(int i=0;i<Record1.size();i++){
            if(Record1.get(i) > 0 && Record2.get(i) > 0){
                streak++;
                maximum = Math.max(streak,maximum);
            }
            else{
                streak = 0;
            }
        }

        return maximum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> person1 = new ArrayList<>();
        List<Integer> person2 = new ArrayList<>();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i <N; i++){
                person1.add(sc.nextInt());
            }

            for(int i = 0; i <N; i++){
                person2.add(sc.nextInt());
            }

            System.out.println(streakCounter(person1, person2));

            person1.clear();
            person2.clear();
        }
        
        sc.close();
    }
}
