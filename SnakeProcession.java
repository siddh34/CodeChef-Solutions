import java.util.Scanner;

public class SnakeProcession {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            String record = sc.next();

            record = record.replaceAll("[.]", "");

            N =  record.length();

            boolean answer = true;
            int len = 0;
            for(int i = 0; i < N; i++){
                if (record.charAt(i) == 'H'){
                    len++;
                    if(len % 2 == 0){
                        answer = false;
                    }
                }
                else if(record.charAt(i) == 'T'){
                    len++;
                    if (len % 2 == 1){
                        answer = false;
                    }
                }
                else{
                    continue;
                }
            }

            if(len % 2 == 1){
                answer = false;
            }

            if(answer){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }

        }
        
        sc.close();
    }
}
