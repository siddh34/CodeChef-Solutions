import java.util.Scanner;

public class WorldChessChampionship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            String str = sc.next();

            int carsenScore = 0, chefScore = 0; 
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'C'){
                    carsenScore += 2;
                }
                else if(str.charAt(i) == 'N'){
                    chefScore += 2;
                }
                else if(str.charAt(i) == 'X'){
                    chefScore++;
                    carsenScore++;
                }
            }

            if(carsenScore > chefScore){
                System.out.println(X*60);
            }
            else if(chefScore == carsenScore){
                System.out.println(X*55);
            }
            else if(chefScore > carsenScore){
                System.out.println(X*40);
            }

        }
        
        sc.close();
    }
}
