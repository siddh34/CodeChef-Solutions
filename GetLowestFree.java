import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GetLowestFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            for(int i = 0; i < 3; i++){
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            System.out.println(list.get(1) + list.get(2));

            list.clear();
        }
        
        sc.close();
    }
}
