import java.util.Scanner;

public class MinimumPizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int min = 0,i = 1;

            while(min <= X*Y){
                min = 4*i;
                if(min >= X*Y){
                    break;
                }
                i++;
            }

            System.out.println(i);
        }
        
        sc.close();
    }
}
