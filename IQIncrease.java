import java.util.Scanner;

public class IQIncrease {
    
    public static void compareIQ(int currentIQ){
        if(currentIQ + 7 > 170){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        IQIncrease.compareIQ(X);
        sc.close();
    }
}
