import java.util.Scanner;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int D = sc.nextInt();

            int k = 0;
            int inDanger = 0, notInDanger = 0;
            for(int i = 0; i < N; i++){
                k = sc.nextInt();

                if(k <= 9 || k >= 80){
                    inDanger++;
                }
                else{
                    notInDanger++;
                }
            }

            int days = 0;
            while(inDanger > 0){
                inDanger -= D;
                days++;
            }

            while(notInDanger > 0){
                notInDanger -= D;
                days++;
            }

            System.out.println(days);
        }
        
        sc.close();
    }
}
