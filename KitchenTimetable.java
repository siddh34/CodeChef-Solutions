import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitchenTimetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> moments = new ArrayList<Integer>();
        List<Integer> time = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i <N; i++){
                moments.add(sc.nextInt());
            }

            for(int i = 0; i <N; i++){
                time.add(sc.nextInt());
            }

            int count = 0;

            for(int i = 0; i <N; i++){
                if(i == 0){
                    if(moments.get(i) >= time.get(i)){
                        count++;
                    }
                }
                else{
                    if(moments.get(i) - moments.get(i - 1) >= time.get(i)){
                        count++;
                    }
                }
            }

            System.out.println(count);

            moments.clear();
            time.clear();
        }
        
        sc.close();
    }
}
