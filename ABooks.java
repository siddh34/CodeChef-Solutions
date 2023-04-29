import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ABooks {
    public static int lessThanElements(List<Integer> a,int start,int curr){

        int count = 0;
        for(int i = start; i < a.size(); i++){
            if(a.get(i) > curr){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            for(int i = 0; i < N; i++){
                a.add(sc.nextInt());
            }
            
            for(int i = 0; i < N; i++){
                b.add(lessThanElements(a, i, a.get(i)));
            }

            for(int i = 0; i < N; i++){
                System.out.print(b.get(i)+" ");
            }
            System.out.println();

            a.clear();
            b.clear();
        }
        
        sc.close();
    }
}
