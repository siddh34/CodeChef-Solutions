import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountTheHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<Integer> Holidays = new HashSet<Integer>();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                Holidays.add(sc.nextInt());
            }

            for(int i = 0; i <= 30; i++) {
                if(i % 7 == 0){
                    Holidays.add(i);
                    Holidays.add(i - 1);
                }
            }

            System.out.println(Holidays.size() - 2);
            
            Holidays.clear();
        }
        
        sc.close();
    }
}
