import java.util.Scanner;

public class ConstructN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            if((N%7)%2 != 0 && N < 7){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
