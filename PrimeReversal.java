import java.util.Scanner;

public class PrimeReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String A = sc.next();
            String B = sc.next();

            int a = 0,b = 0;
            for(int i = 0; i < N; i++){
                if(A.charAt(i) == '1'){
                    a++;
                }

                if(B.charAt(i) == '1'){
                    b++;
                }
            }

            if(a == b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
        
        sc.close();
    }
}
