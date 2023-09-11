import java.util.Scanner;

public class Subsequences_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String str = sc.next();
            int n = str.length();

            long zero[] = new long[n];
            long ans = 0;
            for(int i = 0, ze = 0; i < n; i++){
                zero[i] = ze;
                if(str.charAt(i) == '0') ze++;
            }

            for(int i = n - 1; i >= 0; i--){
                if(str.charAt(i) == '7'){
                    ans += (zero[i] * (zero[i] - 1))/2;
                }
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
