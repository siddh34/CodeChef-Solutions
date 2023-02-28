import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class DiscrepanciesInTheVotersList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> selected = new ArrayList<Integer>();

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        int sum = N1 + N2 + N3;

        int k = 0;
        for(int i = 0; i < sum; i++){
            k = sc.nextInt();
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        for(int i: map.keySet()){
            if(map.get(i) >= 2){
                selected.add(i);
            }
        }

        Collections.sort(selected);

        System.out.println(selected.size());

        for(int I: selected){
            System.out.println(I);
        }

        map.clear();
        sc.close();
    }
}
