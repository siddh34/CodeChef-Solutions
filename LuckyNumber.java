import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber {
    public static List<Integer> splitEven(int k){
        List<Integer> l = new ArrayList<Integer>();

        while(k % 2 == 0){
            l.add(2);
            k = k / 2;
        }

        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long X = sc.nextLong();
            int count = 0;
            if(X % 2 != 0){
                System.out.println(1);
                continue;
            }
            else{
                while(X % 2 == 0){
                    count++;
                    X = X / 2;
                }
            }

            if(count % 2 == 0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}
