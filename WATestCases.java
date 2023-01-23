import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WATestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> extraList = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            
            for(int i = 0; i < N; i++){
                myList.add(sc.nextInt());
            }

            String str = sc.next();

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    extraList.add(myList.get(i));
                }
            }

            for(int k: extraList){
                myList.remove(Integer.valueOf(k));
            }

            Collections.sort(myList);

            System.out.println(myList.get(0));

            extraList.clear();
            myList.clear();
        }
        
        sc.close();
    }
}
