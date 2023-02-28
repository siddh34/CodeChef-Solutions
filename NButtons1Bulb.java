import java.util.Scanner;

public class NButtons1Bulb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();

            int initial = 1;

            for(int i = 0; i <N; i++){
                char ch1 = S.charAt(i);
                char ch2 = R.charAt(i);

                if(!(ch1 == ch2)){
                    initial++;
                }
            }

            if(initial%2 == 0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}
