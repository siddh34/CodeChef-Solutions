import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PseudoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            for(int i = 0; i < N - 1; i++){
                if(A.get(i) > A.get(i+1)){
                    int temp = A.get(i);
                    A.set(i, A.get(i+1));
                    A.set(i + 1,temp);
                    break;
                }
            }

            int c = 0;
            for(int i = 0; i < N - 1; i++){
                if(A.get(i) > A.get(i+1)){
                    c++;
                }
            }

            if(c == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            A.clear();
        }
        
        sc.close();
    }
}
