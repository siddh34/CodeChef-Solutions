import java.util.Scanner;

/**
 * ChefandAnIdealProblemDif
 */
public class ChefandAnIdealProblemDif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = 3;

        System.out.println(X);

        int Y = sc.nextInt();

        if(Y == 2){
            System.out.println(1);
        }
        else{
            System.out.println(2);
        }
        
        sc.close();
    }
}