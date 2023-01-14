import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Long> list = new ArrayList<Long>();
        
        while((--T) >= 0){
            Long N = sc.nextLong();
            Long X = sc.nextLong();
            
            Long count = (long) 0;

            for(Long i = (long) 0; i < N; i++){
                list.add(sc.nextLong());
            }

            for(Long k: list){
                count = count | k;
            }

            Long Y = X - count;
            if((Y&X) == Y){
                System.out.println(Y);
            }
            else{
                System.out.println(-1);
            }


            list.clear();
        }
        
        sc.close();
    }
}
