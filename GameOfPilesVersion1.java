import java.util.Scanner;

public class GameOfPilesVersion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            int minCount = 0;
            boolean one = false;
            for(int i = 0; i < N; i++){
                int rocks = sc.nextInt();

                if(rocks == 1){
                    one = true;
                }
                else if(rocks % 2 != 0){
                    minCount++;
                }
            }

            if(one){
                System.out.println("CHEF");
            }
            else if(minCount % 2 == 0){
                System.out.println("CHEFINA");
            }
            else{
                System.out.println("CHEF");
            }
        }
        sc.close();
    }
}
