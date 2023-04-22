import java.util.Scanner;

public class ChefAndSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            int dist;
            for(int i = 0; i < N; i++){
                dist = sc.nextInt();

                if(dist % K == 0){
                    sb.append("1");
                }
                else{
                    sb.append("0");
                }
            }

            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}
