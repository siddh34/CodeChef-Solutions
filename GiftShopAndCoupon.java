import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GiftShopAndCoupon {
    
    public static int gifts(List<Integer> gifts,int money){
        int count = 0;
        int totalAmountSpent = 0;

        Collections.sort(gifts);

        for(int price: gifts){
            if(totalAmountSpent >= money){
                break;
            }
            totalAmountSpent += price;
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> listOfGifts = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                listOfGifts.add(sc.nextInt());
            }

            System.out.println(gifts(listOfGifts, K));
            listOfGifts.clear();
        }
        
        sc.close();
    }
}
