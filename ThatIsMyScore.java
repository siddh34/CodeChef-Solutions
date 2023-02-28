import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ThatIsMyScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> pi = new ArrayList<Integer>();
        List<Integer> si = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a>=1 && a<=8){
                    if(pi.contains(a)){
                        int index = pi.indexOf(a);
                        int val = si.get(index);
                        si.set(index,Math.max(val,b));
                    }
                    else{
                        pi.add(a);
                        si.add(b);
                    }
                }
            }

            int sum = 0;
            for(int i=0;i<si.size();i++){
                sum += si.get(i);
            }
            
            System.out.println(sum);

            pi.clear();
            si.clear();
        }
        
        sc.close();
    }
}
