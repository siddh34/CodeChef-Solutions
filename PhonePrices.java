import java.util.Scanner;

public class PhonePrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int price[] = new int[N];

            for(int i = 0; i < N; i++){
                price[i] = sc.nextInt();
            }
            
            int count = 1;
            int min = price[0];
            for(int i = 1; i < 5; i++){
                if(min > price[i]){
                    min = price[i];
                    count++;
                }
            }

            int k = 0, incount = 0;
            for(int i = 5; i < N; i++){
                for(int j = k; j < i; j++){
                    if(price[i] < price[j]){
                        incount++;
                    }
                    else{
                        break;
                    }
                }
                k++;
                if(incount == 5) count++;
                incount = 0;
            }

            System.out.println(count);
        }
        sc.close();
    }
}