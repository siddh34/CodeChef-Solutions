import java.util.Scanner;

public class DonationRewards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            if(N <= 3){
                System.out.println("BRONZE");
            }
            else if(N > 3 && N <= 6){
                System.out.println("SILVER");
            }
            else{
                System.out.println("GOLD");
            }
        }
        
        sc.close();
    }
}
