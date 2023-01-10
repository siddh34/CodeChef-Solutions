import java.util.Scanner;

public class DefeatTheMonster1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X + (H*0) > Y){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        
        sc.close();
    }
}
