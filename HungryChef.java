import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int r = sc.nextInt();
            int n = sc.nextInt();
            int ca,cb;
            if(n < a*r){
                System.out.println(-1);
            }
            else{
                cb = (n - a*r)/(b-a);
                if(cb >  r) cb = r;
                ca = r - cb;
                System.out.println(ca+" "+cb);
            }
        }
        sc.close();
    }
}
