import java.util.Scanner;

public class ApplesAndOranges {
    public static void solveDifficultAppleAndOranges(Scanner sc,int A,int B){
        int count = 1;

        while(A % 2 == 0 && B % 2 == 0){
            A = A / 2;
            B = B / 2;
            count++;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // int X = sc.nextInt();

        // int A = sc.nextInt();
        // int B = sc.nextInt();

        // if(X >= A+B){
        //     System.out.println("YES");
        // }
        // else{
        //     System.out.println("NO");
        // }

        // This is other problem at level 1040

        int T = sc.nextInt();
        
        while((--T) >= 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            solveDifficultAppleAndOranges(sc, A, B);
        }
        
        sc.close();
    }
}
