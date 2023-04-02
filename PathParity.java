import java.util.Scanner;

public class PathParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            boolean v = false;
            if(K == 1){
                v = true;
            }   

            if(((N & 1) == 0 || v)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
