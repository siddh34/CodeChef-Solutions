import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UncleJohny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            int K = sc.nextInt();

            int element = list.get(K - 1);

            Collections.sort(list);

            for(int i = 0; i < list.size(); i++){
                if(list.get(i).equals(element)){
                    System.out.println(i + 1);
                    break;
                }
            }

            list.clear();
        }
        
        sc.close();
    }
}
