import java.util.Scanner;

public class ThreePowersOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            String str = sc.next();

            int ones = 0;
            for(int i = 0; i < N; i++){
                if(str.charAt(i) == '1') ones++;
            }

            if(ones <= 3 && !str.equals("1") && !str.equals("10")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
