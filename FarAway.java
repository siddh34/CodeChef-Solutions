import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FarAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Long> list = new ArrayList<Long>();

        while((--T) >= 0){
            Long N = sc.nextLong();
            Long M = sc.nextLong();

            for(Long i = (long) 0; i < N; i++){
                list.add(sc.nextLong());
            }

            Long answer = (long) 0;
            for(Long i: list){
                if(i <= M/2){
                    answer += M - i;
                }
                else{
                    answer += i - 1;
                }
            }

            System.out.println(answer);

            list.clear();
        }
        
        sc.close();
    }
}
