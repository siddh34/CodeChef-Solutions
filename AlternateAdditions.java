import java.util.Scanner;

public class AlternateAdditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            int diff = B - A;
            diff = Math.abs(diff - 2);

            if(diff % 3 == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
