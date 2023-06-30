import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HiringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> selectedcandidates = new ArrayList<Integer>();
        while((--T)>=0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            for(int i=0; i<N; i++){
                String str = sc.next();
                int countf = 0;
                int countP = 0;
    
                for(int j=0; j<M; j++){
                    if(str.charAt(j) == 'F'){
                        countf++;
                    }
                    else if(str.charAt(j) == 'P'){
                        countP++;
                    }
                }

                if((X <= countf) || (X-1 == countf && Y <= countP)){
                    selectedcandidates.add(1);
                }
                else{
                    selectedcandidates.add(0);
                }
            }

            for(int i : selectedcandidates){
                System.out.print(i);
            }
            System.out.println();

            selectedcandidates.clear();
        }
        
        sc.close();
    }    
}