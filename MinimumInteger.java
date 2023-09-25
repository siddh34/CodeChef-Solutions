import java.util.Scanner;

public class MinimumInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int x = sc.nextInt();
            int c = 1;
            for(int j = 2; j*j <= x; j++){
                if(x % j == 0){
                    c = c * j;
                    while(x % j == 0){
                        x = x / j;
                    }
                }
            }

            System.out.println(x * c);
        }
        sc.close();
    }
}
