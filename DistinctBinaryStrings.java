import java.util.Scanner;

public class DistinctBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();
            String S = sc.next();

            int count = 1;
            for(int i = 1; i < N; i++){
                if(S.charAt(i - 1) != S.charAt(i)){
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
