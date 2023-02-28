import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndGameWithSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                a.add(sc.nextInt());
            }

            int odd = 0;
            boolean foundEven = false;

            for(int K: a){
                if(K % 2 == 0 && foundEven == false){
                    foundEven = true;
                }
                else if(K % 2 != 0){
                    odd++;
                }
            }

            if(odd % 2 != 0){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }

        
            a.clear();
        }
        
        sc.close();
    }
}
