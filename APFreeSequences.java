import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APFreeSequences {
    public static boolean isAP(int a,int b,int c){
        return (b - a) == (c - b);
    }

    public static boolean isAPFree(List<Integer> sequences) {
        int n = sequences.size();

        for(int i=0; i<n - 2; i++) {
            for(int j=i+1; j < n - 1; j++) {
                for(int k= j+1; k < n; k++) {
                    if(isAP(sequences.get(i), sequences.get(j) , sequences.get(k))){
                        return false;
                    }
                }
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> sequences = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                sequences.add(sc.nextInt());
            }

            if(isAPFree(sequences)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            sequences.clear();
        }
        
        sc.close();
    }
}