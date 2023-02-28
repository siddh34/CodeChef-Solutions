import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bi_lindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            String str = sc.next();

            List<Character> storage = new ArrayList<Character>();

            int flag = 0;
            if(N <= 2){
                System.out.println(-1);
            }
            else{
                for(int i = 0; i < N; i++){
                    
                    if(storage.contains(str.charAt(i))){
                        flag = 1;
                    }
    
                    storage.add(str.charAt(i));
                }
            }

            if(flag == 1){
                System.out.println(N - 2);
            }
            else{
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}
