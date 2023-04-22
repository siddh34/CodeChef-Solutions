import java.util.Scanner;

public class DividingStamps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int sum = 0,temp = 0;
        for(int i = 0; i < N; i++) {
            sum += sc.nextInt();
            temp += i + 1;
        }

        if(sum == temp) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();
    }
}
