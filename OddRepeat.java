import java.util.Scanner;

public class OddRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            long N = sc.nextLong();
            long K = sc.nextLong();
            long S = sc.nextLong();

            long ss = 0, c = 0, i = 1;

            while(c!=N){
                ss+=i;
                c++;
                i+=2;
            }

            System.out.println((S - ss)/(K - 1));
        }
        
        sc.close();
    }
}
