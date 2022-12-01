import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DevuAndFriendshipTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int n = sc.nextInt();
            int count = n;
            for(int i = 0; i < n; i++){
                list.add(sc.nextInt());
            }

            Collections.sort(list);

            for(int i = 0; i < n - 1; i++){
                if(list.get(i).equals(list.get(i+1))){
                    count--;
                }
            }
            
            System.out.println(count);

            list.clear();
        }
        
        sc.close();
    }
}
