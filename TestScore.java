import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            boolean satisfy = false;

            for(int i = 0; i <= N; i++){
                if(X*i == Y){
                    satisfy = true;
                }
            }
            
            if(satisfy){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
