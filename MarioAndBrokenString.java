import java.util.Scanner;

public class MarioAndBrokenString {
    
    public static void isPossible(String s){
        String A = s.substring(0,s.length()/2);
        String B = s.substring(s.length()/2,s.length());

        String comb1;
        String comb2;

        comb1 = B + A;
        comb2 = A + B;

        if(comb1.equals(comb2)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            String s = sc.next();
            MarioAndBrokenString.isPossible(s);
            T--;
        }

        sc.close();
    }
}
