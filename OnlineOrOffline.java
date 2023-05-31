import java.util.Scanner;

public class OnlineOrOffline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            double N = sc.nextDouble();
            double M = sc.nextDouble();

            double dis = (N*(0.1));
            
            N = N - dis;

            if(N < M){
                System.out.println("ONLINE");
            }
            else if(N > M){
                System.out.println("DINING");
            }
            else{
                System.out.println("EITHER");
            }
        }
        
        sc.close();
    }
}
