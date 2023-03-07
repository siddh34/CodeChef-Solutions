import java.util.Scanner;

public class FriendsMeetup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X1 = sc.nextInt();
            int X2 = sc.nextInt();

            if(X1 == X2){
                System.out.println("YES");
            }
            else if((X1 > X2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
