import java.util.Scanner;

public class SarthakAndHisMagicGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long n = sc.nextLong();

            for(long i = 0; i < n; i++){
                for(long j = 0; j < n; j++){
                    System.out.print(1 + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
