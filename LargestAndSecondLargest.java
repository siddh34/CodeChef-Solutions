import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();
            
            int num = 0;
            for(int i = 0; i < N; i++){
                num = sc.nextInt();
                if(A.contains(num)){
                    continue;
                }
                else{
                    A.add(num);
                }
            }

            Collections.sort(A);
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < A.size() - 1; i++){
                if(max < A.get(i) + A.get(i + 1)){
                    max = Math.max(max, A.get(i) + A.get(i + 1));
                }
            }

            System.out.println(max);

            A.clear();
        }
        
        sc.close();
    }
}
