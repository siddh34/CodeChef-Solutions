import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudyingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S = sc.next();
        
        List<Character> list = new ArrayList<Character>();

        for(int i = 0; i < S.length(); i++) {
            list.add(S.charAt(i));
        }


        int T = sc.nextInt();

        while((--T) >= 0){
            String w = sc.next();

            int count = 0;
            for(int i = 0; i < w.length(); i++){
                if(list.contains(w.charAt(i))){
                    count++;
                }
            }

            if(count == w.length()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}
