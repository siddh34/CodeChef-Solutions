import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoeFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            list.add(A);
            list.add(B);
            list.add(C);

            if(list.contains(0) && list.contains(1)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }

            list.clear();
        }
        
        sc.close();
    }
}
