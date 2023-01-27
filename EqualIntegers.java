import java.util.Scanner;

public class EqualIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int count = 0;

            if(X < Y || X == Y){
                System.out.println(Math.abs(Y - X));
            }
            else if(X > Y){
                if(X%2 == 0 && Y%2 != 0 || X%2 != 0 && Y%2 == 0){
                    X++;
                    count++;
                    do{
                        Y = Y + 2;
                        count++;
                    }while(X != Y);
                }else{
                    do{
                        Y = Y + 2;
                        count++;
                    }while(X != Y);
                }

                System.out.println(count);
            }
        }
        sc.close();
    }
}
