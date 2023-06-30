import java.util.Scanner;

public class ChefAndSalaryPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        while((--T)>=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            String str = sc.next();            

            int n = str.length();
            int streak = 0;
            int maxstreak = 0;
            int ones = 0;
            for(int i = 0; i<n; i++){
                if(str.charAt(i) == '1'){
                    ones++;
                    streak++;
                }
                else{
                    maxstreak = Math.max(maxstreak,streak);
                    streak = 0;
                }
                maxstreak = Math.max(maxstreak,streak);
            }

            System.out.println(X*ones + Y*maxstreak);
        }
        
        sc.close();
    }
}
