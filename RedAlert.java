import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> rainfall = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();
            int D = sc.nextInt();
            int H = sc.nextInt();

            for(int i = 0; i < N; i++){
                rainfall.add(sc.nextInt());
            }

            int waterLevel = 0;
            boolean redAlert = false;
            for(int millimeters: rainfall){
                if(millimeters > 0){
                    waterLevel += millimeters;
                }
                else if(waterLevel < D && millimeters == 0){
                    waterLevel = 0;
                }
                else if(millimeters == 0){
                    waterLevel -= D;
                }

                if(waterLevel > H){
                    redAlert = true;
                    break;
                }
            }

            

            if(redAlert == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            rainfall.clear();
        }
        
        sc.close();
    }
}
