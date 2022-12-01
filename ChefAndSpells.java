import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ChefAndSpells {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            list.add(A+B);
            list.add(B+C);
            list.add(C+A);
            Collections.sort(list);
            System.out.println(list.get(list.size() - 1));
            list.clear();
            T--;
        }

        sc.close();
    }
}
