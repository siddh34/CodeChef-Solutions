import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<String> firstName = new ArrayList<String>();
        List<String> lastName = new ArrayList<String>();
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] name = new String[2];

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                name[0] = sc.next();
                name[1] = sc.next();

                firstName.add(name[0]);
                lastName.add(name[1]);

                map.put(name[0],map.getOrDefault(name[0], 0) + 1);
            }

            for(int i = 0; i < firstName.size(); i++){
                if(map.get(firstName.get(i)) > 1){
                    System.out.println(firstName.get(i)+" "+lastName.get(i));
                }
                else{
                    System.out.println(firstName.get(i));
                }
            }

            map.clear();
            firstName.clear();
            lastName.clear();
        }
        
        sc.close();
    }
}
