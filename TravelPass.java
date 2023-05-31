import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            String str = sc.next();

            int total = 0;
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == '0'){
                    total += a;
                }
                else if(str.charAt(i) == '1'){
                    total += b;
                }   
            }

            System.out.println(total);
        }
        
        sc.close();
    }
}
