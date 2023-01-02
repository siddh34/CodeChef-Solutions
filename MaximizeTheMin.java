import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximizeTheMin {
    public static void getMax(int max,List<Integer> list,int k){
        if(k>=list.size()-1){
            System.out.println(max);
            return;
        }

        Collections.sort(list);

        System.out.println(list.get(k));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        
        while((--T) >= 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int max = 0;

            for(int i = 0; i < n; i++){
                myList.add(sc.nextInt());
                max = Math.max(max,myList.get(i));
            }

            getMax(max,myList,k);

            myList.clear();
        }
        
        sc.close();
    }
}
