import java.util.Scanner;

public class SpellBob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            String S1 = sc.next();
            String S2 = sc.next();

            if((S1.charAt(0) == 'b' || S2.charAt(0) == 'b') && (S1.charAt(1) == 'o' || S2.charAt(1) == 'o') && (S1.charAt(2) == 'b' || S2.charAt(2) == 'b')){
                System.out.println("yes");
            }
            else if((S1.charAt(0) == 'o' || S2.charAt(0) == 'o') && (S1.charAt(1) == 'b' || S2.charAt(1) == 'b') && (S1.charAt(2) == 'b' || S2.charAt(2) == 'b')){
                System.out.println("yes");
            }
            else if((S1.charAt(0) == 'b' || S2.charAt(0) == 'b') && (S1.charAt(1) == 'b' || S2.charAt(1) == 'b') && (S1.charAt(2) == 'o' || S2.charAt(2) == 'o')){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}
