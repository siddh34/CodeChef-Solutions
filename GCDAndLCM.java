import java.util.Scanner;

public class GCDAndLCM {
    public static int GCD(int a,int b){
        if(a==0) return b;
        return GCD(b%a,a);
    }

    public static int LCM(int a,int b){
        return (a / GCD(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(GCD(X, Y)+" "+LCM(X, Y));
        }
        
        sc.close();
    }
}
