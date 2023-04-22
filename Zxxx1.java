import java.util.Scanner;

// This problem has name 0xxx1 as it is not allowed to use 0 as start char of name of java file

public class Zxxx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            long N = sc.nextLong();
            String S = sc.next();

            long count0 = 0, count1 = 0;

            for(int i = 0; i < N; i++){
                if(S.charAt(i) == '0'){
                    count0++;
                }
                else{
                    count1 = count1 + count0;
                }
            }

            System.out.println(count1 % 1000000007);
        }
        
        sc.close();
    }
}
