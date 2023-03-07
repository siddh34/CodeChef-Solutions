import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();

            int sum = 0;
            for(int i = 0; i < S.length(); i++){
                if(Character.isDigit(S.charAt(i))){
                    sum += S.charAt(i) - '0';
                }
            }

            System.out.println(sum);
        }
        
        sc.close();
    }
}
