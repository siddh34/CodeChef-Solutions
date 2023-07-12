import java.util.HashMap;
import java.util.Scanner;

public class ProblemDifficulties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while((--T)>=0){
            for(int i = 0; i < 4; i++){
                int v = sc.nextInt();
                map.put(v,map.getOrDefault(v,0) + 1);
            }

            int max = 0;
            for(int i: map.values()) {
                if(max < i) max = i;
            }

            switch (max) {
                case 1:
                    System.out.println(2);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(1);
                    break;
                case 4:
                    System.out.println(0);
                    break;
                default:
                    break;
            }

            map.clear();
        }
        
        sc.close();
    }
}
