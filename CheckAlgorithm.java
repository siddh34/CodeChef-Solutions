import java.util.Scanner;


public class CheckAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T)>=0){
            String S = sc.next();
            int n = S.length();

            String result = "";
            int count = 1;
            if(n == 1){
                result += S.charAt(0) + 1;
            }
            else{
                for(int i = 0; i < n - 1; i++){
                    if(S.charAt(i) == S.charAt(i+1)){
                        count++;
                    }
                    else{
                        result += S.charAt(i) + Integer.toString(count);
                        count = 1;
                    }
                }
            }
            result += S.charAt(n-1)+Integer.toString(count);
            
            if(result.length() < S.length()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
