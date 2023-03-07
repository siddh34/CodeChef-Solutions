import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> L = new ArrayList<Integer>();
        List<Integer> R = new ArrayList<Integer>();


        while((--T) >= 0){
            int N = sc.nextInt();


            for(int i = 0; i < N; i++){
                L.add(sc.nextInt());
            }

            for(int i = 0; i < N; i++){
                R.add(sc.nextInt());
            }
            
            int max = 0;
            for(int i = 0; i < N; i++){
                if(max < L.get(i)*R.get(i)){
                    max = L.get(i)*R.get(i);
                }
            }
            
            int mustWatch = 0;
            int maxRating = 0;
            for(int i = 0; i < N; i++) {
                if(max == L.get(i)*R.get(i) && maxRating < R.get(i)){
                    maxRating = R.get(i);
                    mustWatch = i + 1;
                }
            }

            System.out.println(mustWatch);

            L.clear();
            R.clear();
        }
        
        sc.close();
    }
}
