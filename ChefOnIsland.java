import java.util.Scanner;

public class ChefOnIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float x = sc.nextInt();
            float y = sc.nextInt();
            float xr = sc.nextInt();
            float yr = sc.nextInt();
            float D = sc.nextInt();

            float food = (x/xr);
            float water = (y/yr);

            float days = Math.min(food, water);

            if(days >= D){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
