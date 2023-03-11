import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LostWeekends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        while((--T) >= 0){
            for(int i = 0; i < 5; i++){
                A.add(sc.nextInt());
            }

            int P = sc.nextInt();

            int sum = 0;
            for(int i = 0; i < A.size(); i++){
                sum += A.get(i)*P;
            }

            if(sum > 120){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            A.clear();
        }
        
        sc.close();
    }
}
