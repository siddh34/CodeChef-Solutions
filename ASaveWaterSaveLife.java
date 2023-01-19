import java.util.Scanner;

public class ASaveWaterSaveLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int H = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int C = sc.nextInt();

            int totalConsumption = H*((x) + (y/2));

            if(totalConsumption <= C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
