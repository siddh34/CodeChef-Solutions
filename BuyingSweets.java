import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyingSweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        while((--T)>=0){
            int N = sc.nextInt();
            int X = sc.nextInt();

            int num = 0;
            int sum = 0;
            for(int i = 0; i < N; i++){
                num = sc.nextInt();
                sum += num;
                A.add(num);
            }

            int a = sum/X;
            boolean extra = false;
            for(int i = 0; i < N; i++){
                if(sum-A.get(i)>=(X*a)){
                    extra = true;
                    break;
                }
            }

            if(extra){
                System.out.println(-1);
            }
            else{
                System.out.println(a);
            }

            A.clear();
        }
        
        sc.close();
    }
}
