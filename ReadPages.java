import java.util.Scanner;

public class ReadPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int i = 0;
            for(i = 0; i < Y; i++){}
            
            if(X*i < N){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
