import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ChocolateMonger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> chocolates = new ArrayList<>();
        
        while((--T) >= 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            for(int i = 0; i < n; i++){
                chocolates.add(sc.nextInt());
            }
            Set<Integer> set = new HashSet<>(chocolates);
            
            if(n == set.size()){
                System.out.println(n - x);
            }
            else if((n - set.size()) >= x){
                System.out.println(set.size());
            }
            else{
                System.out.println(set.size() - (x -(n - set.size())));
            }

            set.clear();
            chocolates.clear();
        }
        
        sc.close();
    }
}
