import java.util.Scanner;

public class DoubleStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            System.out.println(N % 2 == 0 ? N : N - 1);
        }
        
        sc.close();
    }
}
