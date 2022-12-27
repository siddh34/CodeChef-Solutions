import java.util.Scanner;

public class GreaterAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float A = sc.nextInt();
            float B = sc.nextInt();
            float C = sc.nextInt();

            if((A+B)/2 > C){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
