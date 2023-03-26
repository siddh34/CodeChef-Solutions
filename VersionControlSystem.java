import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VersionControlSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();
        while((--T) >= 0){
            int M = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();

            for(int i = 0; i < K; i++){
                A.add(sc.nextInt());
            }

            for(int i = 0; i < N; i++){
                B.add(sc.nextInt());
            }

            int trackedIgnored = 0, untrackedUnignored = 0;
            for(int i = 1; i <= M; i++){
                if(A.contains(i) && B.contains(i)){
                    trackedIgnored++;
                }
                else if(!A.contains(i) && !B.contains(i)){
                    untrackedUnignored++;
                }
            }

            System.out.println(trackedIgnored+" "+untrackedUnignored);

            A.clear();
            B.clear();
        }
        
        sc.close();
    }
}
