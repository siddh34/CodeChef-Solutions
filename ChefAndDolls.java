import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChefAndDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> dolls = new ArrayList<Integer>();
        Map<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i <N; i++){
                dolls.add(sc.nextInt());
            }

            for(int i: dolls){
                Integer count = freqMap.get(i);
                if(count == null){
                    count = 0;
                }
                freqMap.put(i,count + 1);
            }

            for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
                if(entry.getValue() % 2 != 0){
                    System.out.println(entry.getKey());
                }
            }

            freqMap.clear();
            dolls.clear();
        }
        
        sc.close();
    }
}
