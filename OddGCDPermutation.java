import java.util.Scanner;

public class OddGCDPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            if(N % 2 != 0){
                System.out.println(-1);
            }
            else{
                for(int i = N; i > 0; i--){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
