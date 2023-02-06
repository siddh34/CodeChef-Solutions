import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoTimeToWait {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> time = new ArrayList<Integer>();
        

        int N = sc.nextInt();
        int x = sc.nextInt();
        int H = sc.nextInt();

        for(int i = 0; i < N; i++){
            time.add(sc.nextInt());
        }

        boolean worked = false;
        for(int i: time){
            if(i+H >= x){
                worked = true;
                break;
            }
        }

        if(worked){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        time.clear();
        
        sc.close();
    }
}
