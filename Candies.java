import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Candies {
    public static int checkTheLists(List<Integer> A,List<Integer> B){
        int valid = 0;

        Collections.sort(A);
        Collections.sort(B);
        
        //checking by for loop

        A.addAll(B);
        
        List<Integer> freq = new ArrayList<Integer>();

        for(int i: A){
            freq.add(Collections.frequency(A,i));
        }

        for(int j: freq){
            if(j > 2){
                valid = -1;
            }
        }

        freq.clear();

        return valid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> A = new ArrayList<Integer>();
        List<Integer> B = new ArrayList<Integer>();

        // test cases
        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                A.add(sc.nextInt());
            }

            for(int j = 0; j < N; j++){
                B.add(sc.nextInt());
            }

            if(checkTheLists(A, B) == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            A.clear();
            B.clear();

            T--;
        }

        sc.close();
    }
}
