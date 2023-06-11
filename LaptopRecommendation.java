import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class LaptopRecommendation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        HashMap<Integer,Integer> recommendations = new HashMap<Integer,Integer>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                int recommend = sc.nextInt();
                recommendations.put(recommend,recommendations.getOrDefault(recommend,1) + 1);
            }

            Boolean isTwice = false;
            int max = 0;
            int maxR = 0;
            for(Entry<Integer, Integer> r : recommendations.entrySet()){
                if(r.getValue() > max){
                    max = r.getValue();
                    maxR = r.getKey();
                }
            }

            for(Entry<Integer, Integer> r : recommendations.entrySet()){
                if(max == r.getValue() && maxR != r.getKey()){
                    isTwice = true;
                    break;
                }
            }



            if(isTwice){
                System.out.println("CONFUSED");
            }
            else{
                System.out.println(maxR);
            }


            recommendations.clear();
        }
        
        sc.close();
    }
}
