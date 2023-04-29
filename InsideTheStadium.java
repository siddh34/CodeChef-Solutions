import java.util.Scanner;

public class InsideTheStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            int count = 0, totalRun = 0,balls = 0;
            double SR = 0;
            for(int i = 1; i <= N; i++){
                int r = sc.nextInt();
                totalRun += r;
                balls++;
                SR = ((double) totalRun/balls)*100;
                if(SR == 100){
                    count++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
