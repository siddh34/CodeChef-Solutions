import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DegreeOfPolynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> myList = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i <N; i++){
                list.add(sc.nextInt());
            }

            for(int k = 0; k < list.size(); k++){
                if(list.get(k) == 0){
                    myList.add(0);
                }
                else{
                    myList.add(k);
                }
            }

            Collections.sort(myList);

            System.out.println(myList.get(myList.size() - 1));

            myList.clear();
            list.clear();
        }
        
        sc.close();
    }
}
