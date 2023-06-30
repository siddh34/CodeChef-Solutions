import java.util.Scanner;

public class XYSTR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            String str = sc.next();

            int n = str.length();
            int pairs = 0;
            for(int i = 0; i < n - 1; i++) {
                if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'y' || str.charAt(i) == 'y' && str.charAt(i + 1) == 'x'){
                    i+=1;
                    pairs++;
                }
            }

            System.out.println(pairs);
        }
        
        sc.close();
    }
}
