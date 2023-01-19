import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonNegativeProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> negativeNumbers = new ArrayList<Integer>();


        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            for(int i: list){
                if(i < 0){
                    negativeNumbers.add(i);
                }
            }

            if(negativeNumbers.size() % 2 == 0 || list.contains(0)){
                System.out.println(0);
            }
            else{
                System.out.println(negativeNumbers.size());
            }

            negativeNumbers.clear();
            list.clear();
        }
        
        sc.close();
    }
}
