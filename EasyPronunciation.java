import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EasyPronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Character> list = new ArrayList<Character>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');


        while((--T) >= 0){
            int S = sc.nextInt();
            String str = sc.next();
            str = str.toLowerCase();
            int count = 0;
            for(int i = 0; i < S; i++){
                if(count == 4){
                    break;
                }

                if(!list.contains(str.charAt(i))){
                    count++;
                }
                else{
                    count = 0;
                }
            }

            if(count == 4){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
