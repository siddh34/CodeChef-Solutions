import java.util.Scanner;

public class TooManyItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();

            int i = 0;

            while(i*10 < X){
                i++;
            }

            System.out.println(i);
        }
        
        sc.close();
    }
}
