import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SchrodingerSmiley {
    public static int countSchrodingerSmileys(String str) {
        Pattern pattern = Pattern.compile("\\(\\?\\?[:=;][-~]?\\)");

        Matcher matchers = pattern.matcher(str);

        int count = 0;
        while (matchers.find()) {
            count++;
        }

        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            String str = sc.next();

            int count =  countSchrodingerSmileys(str);

            System.out.println(count);
        }
        
        sc.close();
    }
}
