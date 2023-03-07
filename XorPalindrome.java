import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String str = sc.next();

            int count = 0;
            int end = N - 1;
            for(int i = 0; i <= end; i++){
                if(str.charAt(i) != str.charAt(end)){
                    count++;
                }
                end--;
            }

            System.out.println((count+1)/2);
        }
        
        sc.close();
    }
}
