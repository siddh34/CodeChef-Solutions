import java.util.Scanner;

public class ANDPlusOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long x = sc.nextLong();

            if(x == 0) System.out.println(-1);
            else System.out.println(0 + " " + x);
        }
        sc.close();
    }
}
