import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LazySalesman {
    public static int noOfHolidays(List<Integer> payments,int moneyNeeded){
        int count = payments.size(); 
        int pay = 0,i = 0;
        Collections.sort(payments);
        Collections.reverse(payments);

        while(i < payments.size()){
            pay += payments.get(i);
            count--;
            if(pay >= moneyNeeded){
                break;
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> payments = new ArrayList<Integer>();


        while((--T) >= 0){
            int N = sc.nextInt();
            int W = sc.nextInt();
            
            for(int i = 0; i < N; i++){
                payments.add(sc.nextInt());
            }
            
            System.out.println(noOfHolidays(payments, W));

            payments.clear();
        }
        
        sc.close();
    }
}
