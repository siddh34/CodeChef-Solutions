import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrammingLanguages {
    public static int whichLanguage(int A,int B,List<Integer> feature1,List<Integer> feature2) {
        int preferred = 0;
        
        if(feature1.contains(A) && feature1.contains(B)){
            preferred = 1;
        }

        if(feature2.contains(A) && feature2.contains(B)){
            preferred = 2;
        }

        return preferred;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> features1 = new ArrayList<>();
        List<Integer> features2 = new ArrayList<>();
        
        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int A1 = sc.nextInt();
            int B1 = sc.nextInt();
            features1.add(A1);
            features1.add(B1);
            int A2 = sc.nextInt();
            int B2 = sc.nextInt();
            features2.add(A2);
            features2.add(B2);

            System.out.println(whichLanguage(A, B, features1, features2));

            features1.clear();
            features2.clear();

            T--;
        }
        
        sc.close();
    }
}
