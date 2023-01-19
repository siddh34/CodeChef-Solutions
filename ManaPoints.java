import java.util.Scanner;

public class ManaPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt(); 

            if(X > Y){
                System.out.println(0);
            }else{
                int i = 0;
                for(i = 0; i*X <= Y; i++){}

                System.out.println(i - 1);
            }

        }
        
        sc.close();
    }
}
