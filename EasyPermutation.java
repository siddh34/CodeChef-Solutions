import java.util.Scanner;

public class EasyPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = N; i >= 1; i--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
