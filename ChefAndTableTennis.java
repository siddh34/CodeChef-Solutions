import java.util.Scanner;

public class ChefAndTableTennis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String games = sc.next();
            int oneCount = 0,zeroCount = 0;
            for(int i = 0; i < games.length(); i++){
                if(games.charAt(i) == '0'){
                    zeroCount++;
                }
                else if(games.charAt(i) == '1'){
                    oneCount++;
                }
            }

            if(oneCount>zeroCount){
                System.out.println("WIN");
            }
            else{
                System.out.println("LOSE");
            }
        }
        sc.close();
    }
}
