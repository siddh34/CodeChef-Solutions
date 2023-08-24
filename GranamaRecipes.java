import java.util.HashMap;
import java.util.Scanner;

public class GranamaRecipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String recipe1 = sc.next();
            String recipe2 = sc.next();

            recipe1.toLowerCase();
            recipe2.toLowerCase();

            HashMap<Character,Integer> freq1 = new HashMap<>();
            HashMap<Character,Integer> freq2 = new HashMap<>();

            for(int i = 0; i < recipe1.length(); i++) freq1.put(recipe1.charAt(i),freq1.getOrDefault(recipe1.charAt(i),0) + 1);

            for(int i = 0; i < recipe2.length(); i++) freq2.put(recipe2.charAt(i),freq2.getOrDefault(recipe2.charAt(i),0) + 1);

            int c = 0;
            int cn = 0;
            if(freq1.equals(freq2)) c = 1;

            if(freq1.keySet().equals(freq2.keySet())) cn = 1;

            if(c == cn){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
