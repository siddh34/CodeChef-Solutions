import java.util.Scanner;

public class IPLAndRCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if(X <= Y){
                System.out.println(0);
            }
            else{
                System.out.println(X-Y);
            }
        }
        sc.close();
    }
}
