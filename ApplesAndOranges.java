import java.util.Scanner;

public class ApplesAndOranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();

        int A = sc.nextInt();
        int B = sc.nextInt();

        if(X >= A+B){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        sc.close();
    }
}
