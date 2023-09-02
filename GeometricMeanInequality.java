import java.util.HashMap;
import java.util.Scanner;

public class GeometricMeanInequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        while(T-->0){
            int N = sc.nextInt();
            
            for(int i = 0; i < N; i++){
                int k = sc.nextInt();
                map.put(k,map.getOrDefault(k, 0)+1);
            }

            int ones = map.get(1) != null ? map.get(1) : 0;
            int nones = map.get(-1) != null ? map.get(-1) : 0;

            if(nones % 2 != 0 && ones % 2 != 0){
                if(Math.abs(nones - ones)>0){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }
            else if(nones % 2 == 0 && ones % 2 == 0){
                if(Math.abs(nones - ones)>2){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }
            else{
                if(Math.abs(nones - ones)>1){
                    System.out.println("No");
                }
                else{
                    System.out.println("Yes");
                }
            }

            map.clear();
        }
        sc.close();
    }
}
