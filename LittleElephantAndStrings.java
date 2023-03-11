import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LittleElephantAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lucky = new ArrayList<String>();
        Set<String> fav = new HashSet<String>();
        int K = sc.nextInt();
        int N = sc.nextInt();

        for(int i = 0; i < K; i++){
            fav.add(sc.next());
        }

        for(int i = 0; i < N; i++){
            lucky.add(sc.next());
        }

        for(int i = 0; i < N; i++){
            String str = lucky.get(i);
            
            if(str.length() >= 47){
                System.out.println("Good");
            }
            else{
                boolean isGood = false;
                for(String s: fav){
                    if(str.contains(s)){
                        isGood = true;
                        break;
                    }
                }
                if(isGood){
                    System.out.println("Good");
                }
                else{
                    System.out.println("Bad");
                }
            }
        }

        
        sc.close();
    }
}
