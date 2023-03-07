import java.util.Scanner;

public class AlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String S = sc.next();

            int zeros = 0,ones = 0;

            for(int i = 0; i < N; i++){
                if(S.charAt(i) == '0'){
                    zeros++;
                }
                else{
                    ones++;
                }
            }

            if(zeros == ones){
                System.out.println(2*zeros);
            }
            else if(zeros < ones){
                System.out.println(2*zeros + 1);
            }
            else{
                System.out.println(2*ones + 1);
            }
        }
        
        sc.close();
    }
}
