import java.util.Scanner;

public class Plus2OrMinus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            if(N==0){
                System.out.println(1);
            }
            else{
                System.out.println(N*3);
            }
        }
        
        sc.close();
    }
}
