import java.util.Scanner;

public class PlayingWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            
            String S = sc.next();
            String R = sc.next();


            int sones = 0;
            int rones = 0;
            
            for(int i = 0; i <N; i++){
                if(S.charAt(i) == '1'){
                    sones++;
                }
            }

            for(int i = 0; i <N; i++){
                if(R.charAt(i) == '1'){
                    rones++;
                }
            }

            if(sones == rones){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
