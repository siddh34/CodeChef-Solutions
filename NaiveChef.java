import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NaiveChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            int c = 0,d = 0;
            for(int i = 0; i <N; i++){
                list.add(sc.nextInt());
                
                if(list.get(i) == A){
                    c++;
                }

                if(list.get(i) == B){
                    d++;
                }
            }

            float prob = (c/N)*(d/N);

            System.out.println(prob);

            list.clear();
        }
        
        sc.close();
    }
}
