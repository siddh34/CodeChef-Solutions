import java.util.Scanner;

public class TwoVsTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String str = sc.next();

            if(str.charAt(str.length() - 1) == '5'){
                System.out.println(1);
            }
            else if(str.charAt(str.length() - 1) == '0'){
                System.out.println(0);
            }
            else{
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}
