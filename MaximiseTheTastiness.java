import java.util.Scanner;

public class MaximiseTheTastiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int tastiness = 0;

            if(a > b){
                tastiness += a;
            }
            else{
                tastiness += b;
            }

            if(c > d){
                tastiness += c;
            }
            else{
                tastiness += d;
            }

            System.out.println(tastiness);
        }
        
        sc.close();
    }
}
