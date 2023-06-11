import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LittleChefAndSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> revlist = new ArrayList<Integer>();
        while((--T)>=0){
            int N = sc.nextInt();

            for(int i=0; i<N; i++){
                list.add(sc.nextInt());
                revlist.add(list.get(i));
            }

            Collections.sort(list);

            for(int i=0; i<N; i++){
                if(revlist.get(i) == list.get(0)){
                    System.out.println(i + 1);
                    break;
                }
            }

            list.clear();
            revlist.clear();
        }
        
        sc.close();
    }
}