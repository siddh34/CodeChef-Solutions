import java.util.Scanner;

public class PrefixPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            if(N % 2 != 0){
                System.out.println(-1);
            }
            else{
                for(int i = 0; i <=N; i+=2){
                    System.out.print((i+1)+" "+i+" ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
