import java.util.Scanner;

public class OddPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int odd = 0,even = 0;
            for(int i = 0; i < N; i++){
                if(i % 2 != 0){
                    odd++;
                }
                else{
                    even++;
                }
            }

            System.out.println(odd*even*2);
        }

        
        sc.close();
    }
}
