import java.util.Scanner;

public class MakeAP {
    public static int numberInAP(int A,int B){
        int number = -1;

        for(int i = A; i <= B; i++){
            if(Math.abs(i - A) == Math.abs(i - B)){
                number = i;
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(numberInAP(A, B));
        }
        
        sc.close();
    }
}
