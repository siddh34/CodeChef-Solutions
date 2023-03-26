import java.util.Scanner;

public class ChefAndDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();
            
            int zero = 0,one = 0;
            for(int i = 0; i < S.length(); i++){
                if(S.charAt(i) == '0'){
                    zero++;
                }
                else if(S.charAt(i) == '1'){
                    one++;
                }   
            }

            if(zero == 1 || one == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
