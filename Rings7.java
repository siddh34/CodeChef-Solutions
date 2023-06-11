import java.util.Scanner;

public class Rings7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int d = n * x;
            int c = d;
            int count = 0;
            while(c%10>=0){
                count++;
                c = c / 10;
                if(c == 0){
                    break;
                }
            }

            if(count == 5){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
