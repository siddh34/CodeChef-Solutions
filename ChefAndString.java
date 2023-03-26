import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();

            if(S.length() == 1){
                System.out.println("YES");
            }
            else{
                String l = S.substring(1) + "" + S.charAt(0);
                String r = S.substring(S.length() - 1) + "" + S.substring(0,S.length() - 1);
                if(l.compareTo(r) == 0){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        
        sc.close();
    }
}
