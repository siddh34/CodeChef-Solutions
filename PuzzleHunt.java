import java.util.Scanner;

public class PuzzleHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N <= 8 && N >= 6){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        sc.close();
    }
}
