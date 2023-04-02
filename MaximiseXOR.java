import java.util.Scanner;

public class MaximiseXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String A = sc.next();
            String B = sc.next();

            int zeros = 0,ones = 0;

            for(int i = 0; i < A.length(); i++){
                if(A.charAt(i) == '1'){
                    ones++;
                }
                else{
                    zeros++;
                }

                if(B.charAt(i) == '1'){
                    ones++;
                }
                else{
                    zeros++;
                }
            }

            int temp = Math.min(ones,zeros);

            StringBuilder answer = new StringBuilder();

            for(int i = 0; i < temp; i++){
                answer.append("1");
            }

            for(int i = temp; i < A.length(); i++){
                answer.append("0");
            }

            System.out.println(answer);
        }
        
        sc.close();
    }
}
