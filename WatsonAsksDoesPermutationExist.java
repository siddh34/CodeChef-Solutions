import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WatsonAsksDoesPermutationExist {
    public static String myDiffOk(List<Long> Rec,Long N){
        String result = "YES";

        for(int i=1;i<Rec.size();i++){
            if(Rec.get(i) - Rec.get(i-1) > 1){
                result = "NO";
                break;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Long> record = new ArrayList<Long>();

        while((--T) >= 0){
            Long N = sc.nextLong();

            for(Long i = (long) 0; i < N; i++){
                record.add(sc.nextLong());
            }

            System.out.println(myDiffOk(record,N));

            record.clear();
        }
        
        sc.close();
    }
}
