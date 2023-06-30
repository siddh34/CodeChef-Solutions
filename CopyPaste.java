import java.util.HashSet;
import java.util.Scanner;

public class CopyPaste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        HashSet<Integer> A = new HashSet<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();
            
            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            System.out.println(A.size());

            A.clear();
        }
        
        sc.close();
    }
}
