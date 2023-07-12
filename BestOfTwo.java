import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        
        while((--T)>=0){
            for(int i = 0; i < 3; i++){
                list1.add(sc.nextInt());
            }

            for(int i = 0; i < 3; i++){
                list2.add(sc.nextInt());
            }

            Collections.sort(list1);
            Collections.sort(list2);


            int as = list1.get(1) + list1.get(2);
            int bs = list2.get(1) + list2.get(2);

            if(as > bs){
                System.out.println("Alice");
            }
            else if(as < bs){
                System.out.println("Bob");
            }
            else{
                System.out.println("Tie");
            }

            list1.clear();
            list2.clear();
        }
        sc.close();
    }
}
