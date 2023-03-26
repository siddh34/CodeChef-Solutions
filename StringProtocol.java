import java.util.Scanner;

public class StringProtocol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            String S = sc.next();

            int count = 0;
            int i  = 0;
            for(i = 0; i < N - 1; i++){
                if(S.charAt(i) == S.charAt(i+1)){
                    i++;
                }
                count++;
            }

            if(i < N){
                count++;
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
