import java.util.Scanner;

public class MaxBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            // int N = sc.nextInt(); // just comment it out
            int K = sc.nextInt();

            String str = sc.next();

            StringBuilder myStr = new StringBuilder(str);

            if(str.charAt(0) == '0'){
                myStr.setCharAt(0, '1');
                K--;
            }

            while(--K >= 0){
                myStr.append(0);
            }

            System.out.println(myStr.toString());
        }
        
        sc.close();
    }
}
