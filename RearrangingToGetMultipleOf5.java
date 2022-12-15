import java.util.Scanner;

public class RearrangingToGetMultipleOf5 {
    public static int isMultipleOf5(String num){
        for(int i=0;i<num.length();i++){
            if(num.charAt(i) == '0' || num.charAt(i) == '5'){
                return 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int D = sc.nextInt();
            String N = sc.next();

            if(isMultipleOf5(N) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
