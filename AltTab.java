import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AltTab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();

        String name = "";
        while((--T)>=0){
            name = sc.next();
            list.add(0,name);
        }

        StringBuilder sb = new StringBuilder();
        for(String s : list){
            if(!set.contains(s)){
                sb.append(s.substring(s.length() - 2));
                set.add(s);
            }
        }

        System.out.println(sb.toString());
        set.clear();
        list.clear();
        sc.close();
    }
}
