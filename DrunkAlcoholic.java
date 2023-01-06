import java.util.Scanner;

public class DrunkAlcoholic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int k = sc.nextInt();
            int z = 0;
            for(int i = 1; i <= k; i++){
                if(i % 2 == 0){
                    z = z - 1;
                }
                else{
                    z = z + 3;
                }
            }

            System.out.println(z);
        }
        
        sc.close();
    }
}
