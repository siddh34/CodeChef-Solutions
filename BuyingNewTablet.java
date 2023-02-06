import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyingNewTablet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> price = new ArrayList<Integer>();
        List<Integer> height = new ArrayList<Integer>();
        List<Integer> width = new ArrayList<Integer>();
        List<Integer> screen = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();
            int B = sc.nextInt();

            int max = 0;
            for(int i = 0; i < N;i++){
                width.add(sc.nextInt());
                height.add(sc.nextInt());
                price.add(sc.nextInt());

                if((width.get(i)*height.get(i))>max && price.get(i) <= B){
                    max = width.get(i)*height.get(i);
                }
            }


            if(max == 0){
                System.out.println("no tablet");
            }
            else{
                System.out.println(max);
            }

            screen.clear();
            price.clear();
            width.clear();
            height.clear();
        }
        
        sc.close();
    }
}
