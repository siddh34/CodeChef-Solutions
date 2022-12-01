import java.util.Scanner;

public class ChefAndOperators {
    public static String getRelation(int A,int B){
        if(A > B){
            return ">";
        }
        else if(A < B){
            return "<";
        }
        else{
            return "=";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(getRelation(A,B));

            T--;
        }

        sc.close();
    }
}
