import java.util.Scanner;

public class ArchiAndComparsion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();

            if(n % 2 == 0){
                long a1 = Math.abs(a);
                long b1 = Math.abs(b);

                if(a1 < b1){
                    System.out.println(2);
                }
                else if(a1 > b1){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else{
                if(a < b){
                    System.out.println(2);
                }
                else if(a > b){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
        }
        sc.close();
    }
}
