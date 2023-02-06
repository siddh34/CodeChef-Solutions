import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            
            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            int cnt = 0;
            for(int i = 0; i < list.size(); i++){
                int sum = 0, product = 1;
                for(int j = i; j < list.size(); j++){
                    sum += list.get(j);
                    product *= list.get(j);
                    if(sum == product){
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);

            list.clear();
        }
        
        sc.close();
    }
}
