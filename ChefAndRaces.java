import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ChefAndRaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            list1.add(X);
            list1.add(Y);

            list2.add(A);
            list2.add(B);

            list1.retainAll(list2);

            System.out.println(2 - list1.size());

            list2.clear();
            list1.clear();
        }
        
        sc.close();
    }
}
