import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefAndCookOffContests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<String, Integer> problems = new HashMap<String, Integer>();
        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                String prb = sc.next();
                problems.put(prb,problems.getOrDefault(prb, 0) + 1);
            }

            if(problems.containsKey("cakewalk") && problems.containsKey("simple") && problems.containsKey("easy") && (problems.containsKey("easy-medium") || problems.containsKey("medium")) && (problems.containsKey("medium-hard") || problems.containsKey("hard"))){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            problems.clear();
        }
        
        sc.close();
    }
}
