import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int D = sc.nextInt();
            int d = sc.nextInt();
            Long A = sc.nextLong();
            Long B = sc.nextLong();
            Long C = sc.nextLong();

            if(10 <= d*D && d*D < 21){
                System.out.println(A);
            }
            else if(21 <= d*D && d*D < 42){
                System.out.println(B);
            }
            else if(42 <= d*D){
                System.out.println(C);
            }
            else{
                System.out.println(0);
            }
        }
        
        sc.close();
    }
}
