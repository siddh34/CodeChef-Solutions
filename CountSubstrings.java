import java.util.Scanner;

public class CountSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            String str = sc.next();

            long count = 0;
            for(int i = 0; i < N; i++){
                if(str.charAt(i) == '1') count++;
            }

            System.out.println((count)*(count+1)/2);
        }
        sc.close();
    }
}
