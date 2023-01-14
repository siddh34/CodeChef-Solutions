import java.util.Scanner;

public class ValentineIsComing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int count = 0;

            if(Y > X){
                System.out.println(0);
            }
            else{
                while(count*Y <= X){
                    count += 1;
                }
                System.out.println(count - 1);
            }
        }
        
        sc.close();
    }
}
