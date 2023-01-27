import java.util.Scanner;

public class rouggh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if(X < Y){
                System.out.println(Math.abs(X - Y));
            }
            else{
                if ((X-Y) % 2 == 0){
                    System.out.println((X - Y) / 2);
                }
                else{
                    System.out.println(Math.abs(X - Y)/ (2 + 2));
                }
            }            
        }
        
        sc.close();
    }
}
