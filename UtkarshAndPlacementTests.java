import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtkarshAndPlacementTests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<String> myCompany = new ArrayList<String>();
        
        while((--T) >= 0){
            String A = sc.next();
            String B = sc.next();
            String C = sc.next();

            myCompany.add(A);
            myCompany.add(B);
            myCompany.add(C);

            String OA = sc.next();
            String OB = sc.next();

            int k = 0,l = 0;

            for(int i = 0; i < myCompany.size(); i++){
                if(myCompany.get(i).equals(OA)){
                    k = i;
                }

                if(myCompany.get(i).equals(OB)){
                    l = i;
                }
            }

            if(k < l){
                System.out.println(OA);
            }
            else{
                System.out.println(OB);
            }

            myCompany.clear();
        }
        
        sc.close();
    }
}
