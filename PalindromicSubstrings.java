import java.util.Scanner;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String A = sc.next();
            String B = sc.next();

            boolean answer = false;
            if(A.length() < B.length()){
                for(int i = 0; i < A.length(); i++){
                    if(B.indexOf(A.substring(i, i+1)) != -1){
                        answer = true;
                        break;
                    }
                }
            }
            else{
                for(int i = 0; i < B.length(); i++){
                    if(A.indexOf(B.substring(i, i+1)) != -1){
                        answer = true;
                        break;
                    }
                }
            }

            if(answer){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
