import java.util.Scanner;

public class NonAdjacentFlips {
    public static int flips(int N,String str){
        int count = 0;

        if(str.charAt(0) == '1'){
            count++;
        }

        for(int i = 1; i < N; i++){
            if(str.charAt(i) =='1' && str.charAt(i-1) == '1'){
                return 2;
            }

            if(str.charAt(i) == '1'){
                return count++;
            }
        }

        if(count == 0){
            return 0;
        }

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            String str = sc.next();

            System.out.println(flips(N, str));
        }
        
        sc.close();
    }
}
