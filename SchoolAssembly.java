import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolAssembly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> h = new ArrayList<>();
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            h.add(sc.nextLong());
        }
        
        sc.close();
        long max = h.get(0);
        
        int i = 0;
        long count = 1;
        for(i = 1; i < N; i++){
            if(h.get(i - 1) < h.get(i) && h.get(i) > max){
                count++;
                max = Math.max(h.get(i), max);
            }
            else{
                continue;
            }
        }

        System.out.println(count);
    
        h.clear();
    }
}
