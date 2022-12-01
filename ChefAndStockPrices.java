import java.util.Scanner;

public class ChefAndStockPrices {
    public static float getNewStockPrice(float stockPrice,float changePercent){
        if(changePercent < 0){
            changePercent = Math.abs(changePercent);
            return stockPrice - (stockPrice*(changePercent/100));
        }
        else{
            return stockPrice + (stockPrice*(changePercent/100));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float S = sc.nextInt();
            float A = sc.nextInt();
            float B = sc.nextInt();
            float C = sc.nextInt();

            S = getNewStockPrice(S, C);

            if(S >= A && S <= B){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
