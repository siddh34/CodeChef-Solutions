import java.util.Scanner;

public class CielAndReceipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int count = 0;
            if(N>=2048){
                count=N/2048;
                N=N%2048;
            }

            String str = Integer.toBinaryString(N);

            for(char ch: str.toCharArray()){
                if(ch == '1'){
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}