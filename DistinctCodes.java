import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Set<String> set = new HashSet<String>();

        while((--T) >= 0){
            String S = sc.next();

            int count = 0;
            for(int i = 0;i < S.length() - 1;i++){
                String s = ""+S.charAt(i)+S.charAt(i+1);
                if(set.contains(s)){
                    continue;
                }
                else{
                    set.add(s);
                    count++;
                }
            }

            System.out.println(count);

            set.clear();
        }
        
        sc.close();
    }
}
