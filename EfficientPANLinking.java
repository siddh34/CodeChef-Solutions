import java.util.Scanner;

public class EfficientPANLinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();

            StringBuilder sb = new StringBuilder();

            if(S.length() == 1){
                sb.append(S.charAt(S.length() - 1));
            }
            else{
                sb.append(S.charAt(S.length() - 2));
                sb.append(S.charAt(S.length() - 1));
            }


            int num = Integer.parseInt(sb.toString());

            System.out.println(num % 20);
        }
        
        sc.close();
    }
}
