import java.util.Scanner;

public class MaxPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        int N = sc.nextInt();
        String str = sc.next();

        int pow = 0;
        for(int i=0; i<N; i++){
            if(str.charAt(i) == '1'){
                pow = N - (i + 1);
                // break;
            }
        }

        System.out.println(pow);
        
        
        sc.close();
    }
}
