import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> freq = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            int max = 0;

            for(int i: list){
                freq.add(Collections.frequency(list, i));
            }
            
            for(int i: freq){
                if(i > max){
                    max = i;
                }
            }

            System.out.println(N - max);

            freq.clear();
            list.clear();
        }
        
        sc.close();
    }
}
