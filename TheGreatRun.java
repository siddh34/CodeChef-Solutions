import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheGreatRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();

        while((--T) >= 0){

            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                a.add(sc.nextInt());
            }

            int tSum = 0,mSum = 0; 
            if(N == K){
                for(int i = 0; i < N; i++){
                    tSum += a.get(i);
                }
                mSum = tSum;
            }
            else{
                for(int i = 0; i < N - K; i++){
                    tSum = 0;
                    for(int j = i; j < i + K; j++){
                        tSum += a.get(j);
                    }
                    if(tSum > mSum){
                        mSum = tSum;
                    }
                }
            }
            
            System.out.println(mSum);

            a.clear();
        }
        
        sc.close();
    }
}
