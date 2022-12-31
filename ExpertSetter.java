import java.util.Scanner;

public class ExpertSetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float X = sc.nextInt();
            float Y = sc.nextInt();

            if((X/2) <= Y){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
