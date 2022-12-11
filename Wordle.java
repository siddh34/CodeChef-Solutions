import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String S = sc.next();
            String K = sc.next();

            for(int i = 0; i < S.length(); i++){
                if(S.charAt(i) == K.charAt(i)){
                    System.out.print("G");
                }
                else{
                    System.out.print("B");
                }
            }

            System.out.println();
        }
        
        sc.close();
    }
}
