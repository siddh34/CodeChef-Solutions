import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheOldSaintAndThreeQuestions {
    public static int getZeroCount(List<Integer> list){
        int count = 0;

        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(0)){
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        while((--T) >= 0){
            for(int i = 0; i < 3; i++){
                l1.add(sc.nextInt());
            }

            for(int i = 0; i < 3; i++){
                l2.add(sc.nextInt());
            }

            int firstZeros = getZeroCount(l1);
            int secondZeros = getZeroCount(l2);

            if(firstZeros != secondZeros){
                System.out.println("Fail");
            }
            else{
                System.out.println("Pass");
            }

            l1.clear();
            l2.clear();
        }
        
        sc.close();
    }
}
