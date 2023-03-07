import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        List<Character> A = new ArrayList<Character>(); 
        List<Character> B = new ArrayList<Character>(); 

        for(int i = 0; i < N; i++) {
            String str = sc.next();

            int half = str.length()/2;
            int k;

            if(str.length() % 2 == 0) {
                k = 0;
            }
            else{
                k = 1;
            }

            for(int j = 0; j < half;j++){
                    A.add(str.charAt(j));
                    B.add(str.charAt(half + k));
                    k++;
            }   

            Collections.sort(A);
            Collections.sort(B);

            boolean isGood = true;

            for(int x = 0; x < half; x++){
                if(A.get(x) == B.get(x)){
                    continue;
                }
                else{
                    isGood = false;
                    break;
                }
            }

            if(isGood){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            A.clear();
            B.clear();
        }

        sc.close();
    }
}
