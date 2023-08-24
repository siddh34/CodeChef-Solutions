import java.util.Scanner;

public class AkhilAndColoredBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String str1 = sc.next();
            String str2 = sc.next();

            int n = str1.length();
            String ans = "";
            for(int i = 0; i < n; i++){
                if(str1.charAt(i) == str2.charAt(i) && str1.charAt(i) == 'W'){
                    ans += 'B';
                }
                else if(str1.charAt(i) == str2.charAt(i) && str1.charAt(i) == 'B'){
                    ans += 'W';
                }
                else{
                    ans += 'B';
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
