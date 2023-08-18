import java.util.Scanner;

public class DazzlingAXNODRChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            long N = Long.parseLong(sc.next());

            if(N % 4 == 0){
                System.out.println(N+3);
            }
            else if(N % 4 == 2 || N % 4 == 3){
                System.out.println(3);
            }
            else{
                System.out.println(N);
            }
        }
        sc.close();
    }
}
