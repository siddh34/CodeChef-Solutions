import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndSubsetAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
    
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        while((--T)>=0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for(int i=0; i<N; i++){
                A.add(sc.nextInt());
            }

            for(int i=0; i<N; i++){
                B.add(sc.nextInt());
            }

            String ans= "Yes";
            for(int i=0; i<N; i++){
                if(Math.abs(A.get(i) - B.get(i)) != X && Math.abs(A.get(i) - B.get(i)) != Y){
                    ans = "False";
                    break;
                }
            }

            System.out.println(ans);

            A.clear();
            B.clear();
        }
        
        sc.close();
    }
}
