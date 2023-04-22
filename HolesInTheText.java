import java.util.Scanner;

public class HolesInTheText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();

            int hole = 0;
            for(int i = 0; i < S.length(); i++){
                if(S.charAt(i) == 'A' || S.charAt(i) == 'O' || S.charAt(i) == 'P' || S.charAt(i) == 'R' || S.charAt(i) == 'D' || S.charAt(i) == 'Q'){
                    hole++;
                }
                else if(S.charAt(i) == 'B'){
                    hole+=2;
                }
            }

            System.out.println(hole);
        }

        
        sc.close();
    }
}
