import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathisonAndPangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        char[] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            for(int i = 0; i < 26; i++){
                list.add(sc.nextInt());
            }

            String S = sc.next();

            int sum = 0;
            for(int i = 0; i < 26; i++){
                if(S.contains(String.valueOf(c[i]))){
                    continue;
                }
                else{
                    sum += list.get(i);
                }
            }

            System.out.println(sum);

            list.clear();
        }
        
        sc.close();
    }
}
