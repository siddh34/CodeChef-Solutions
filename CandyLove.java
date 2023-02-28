import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandyLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }
            int sum = 0;

            for(int i: A){
                sum += i;
            }

            if(sum % 2 != 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            A.clear();
        }
        
        sc.close();
    }
}
