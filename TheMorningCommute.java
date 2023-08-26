import java.util.Scanner;

public class TheMorningCommute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            long total = 0;
            for(int i = 0; i < N; i++){
                int d1 = sc.nextInt();
                int d2 = sc.nextInt();
                int d3 = sc.nextInt();

                if(total < d1) total = d1 + d2;
                else if(total == d1) total += d2;
                else{
                    if(total > d1 && total < (d1 + d3)) total = d1 + d2 + d3;
                    else if(total > d1 && total >= (d1 + d3)){
                        long d = total - d1;
                        d = (d + d3 - 1) / d3;
                        total = d1 + d2 + (d*d3);
                    }
                }
            }
            System.out.println(total);
        }
        sc.close();
    }
}
