import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            list.add(A);
            list.add(B);
            list.add(C);

            Collections.sort(list);

            System.out.println(list.get(list.size() - 2));

            list.clear();
        }
        
        sc.close();
    }
}
