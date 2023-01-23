import java.util.Scanner;

public class Indivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            for(int i = 2; i <= 100;i++){
                if(A % i != 0){
                    if(B % i != 0){
                        if(C % i != 0){
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }
        
        sc.close();
    }
}
