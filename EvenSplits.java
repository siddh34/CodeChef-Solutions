import java.util.Scanner;

public class EvenSplits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            String str = sc.next();

            int countOfZero = 0;

            if(N == 2){
                System.out.println(str);
            }
            else{
                for(int i = 0; i < N; i++){
                    if(str.charAt(i) == '0'){
                        countOfZero++;
                    }
                }

                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < N; i++){
                    if(i < countOfZero){
                        sb.append("0");
                    }
                    else{
                        sb.append("1");
                    }
                }
                
                System.out.println(sb);
            }
        }
        
        sc.close();
    }
}
