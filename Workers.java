import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> c = new ArrayList<Integer>();
        List<Integer> t = new ArrayList<Integer>();


        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            c.add(sc.nextInt());
        }

        for(int i = 0; i < N; i++){
            t.add(sc.nextInt());
        }

        int min1 = 999999, min2 = 999999, min3 = 999999;
        for(int i = 0; i < N; i++){
            if(t.get(i) == 1){
                if(min1 > c.get(i)){
                    min1 = c.get(i);
                }
            }
            else if(t.get(i) == 2){
                if(min2 > c.get(i)){
                    min2 = c.get(i);
                }
            }
            else if(t.get(i) == 3){
                if(min3 > c.get(i)){
                    min3 = c.get(i);
                }
            }
        }

        int tCost = Math.min(min1+min2,min3);

        System.out.println(tCost);

        c.clear();
        t.clear();
        
        sc.close();
    }
}
