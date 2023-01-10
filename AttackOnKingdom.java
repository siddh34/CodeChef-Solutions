import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AttackOnKingdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            System.out.println(list.get(1));

            list.clear();
        }
        
        sc.close();
    }
}
