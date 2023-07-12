import java.util.Scanner;

public class DownloadFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            int result = 0;
            for(int i = 0; i < N; i++){
                int min = sc.nextInt();
                int cost = sc.nextInt();
                if(min >= K){
                    min -= K;
                    K -= K;
                }
                else{
                    K -= min;
                    min = 0;
                }

                result += cost*min;
            }

            System.out.println(result);
        }
        
        sc.close();
    }
}
