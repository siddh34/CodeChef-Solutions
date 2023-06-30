import java.util.Scanner;

public class ChefAndDemonetisation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int S = sc.nextInt();
            int N = sc.nextInt();

            if(N > S){
                if(S%2 == 0 || S == 1){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
            else{
                int c = S / N;

                int r = S - c * N;

                if(r == 0){
                    System.out.println(c);
                }
                else if(r == 1 || r % 2 == 0){
                    System.out.println(c + 1);
                }
                else{
                    System.out.println(c + 2);
                }
            }
        }
        
        sc.close();
    }
}
