import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodQualityBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            for(int i = 0; i < N - 1; i++){
                list.add(sc.nextInt());
            }

            int sum = 0;
            for(int k: list){
                sum += k;
            }

            int res = N*X - sum; 

            if(res >= X){
                System.out.println(res);
            }
            else{
                System.out.println(0);
            }

            list.clear();
        }
        
        sc.close();
    }
}
