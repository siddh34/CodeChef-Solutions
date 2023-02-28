import java.util.Scanner;

public class BinaryStringCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String str = sc.next();

            int countZero = 0,countOne = 0;
            for(int i = 0; i < N - 1; i++){
                if(str.charAt(i) == '1'){
                    countOne++;
                }

                if(str.charAt(i) == '0'){
                    countZero++;
                }
            }

            if(countZero > 0 && countOne > 0){
                System.out.println(Math.min(X,Y));
            }
            else{
                System.out.println(0);
            }

        }
        
        sc.close();
    }
}