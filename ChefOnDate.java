import java.util.Scanner;

public class ChefOnDate {
    public static void payTheBill(int X,int Y){
        if(X < Y){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            ChefOnDate.payTheBill(X, Y);
            n--;
        }
        sc.close();
    }
}
