import java.util.Scanner;

public class ImportantPagesOnCodeChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while((--T)>0){
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A == 0 && B == 1){
                System.out.println("https://www.codechef.com/practice");
            }
            else if(A == 1 && B == 0){
                System.out.println("https://www.codechef.com/contests");
            }
            else if(A == 1 && B == 1){
                System.out.println("https://discuss.codechef.com");
            }
        }

        sc.close();
    }
}
