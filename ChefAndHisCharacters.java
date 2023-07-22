import java.util.Arrays;
import java.util.Scanner;

public class ChefAndHisCharacters {
    public static boolean isLovely(String substr){
        char arr[] = substr.toCharArray();

        Arrays.sort(arr);
        String check = "cefh";
        for(int i = 0; i < 4; i++){
            if(arr[i]!= check.charAt(i)){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String str = sc.next();
            int n = str.length();
            int count = 0;

            for(int i = 0; i < n - 3; i++){
                String sub = str.substring(i,i+4);
                if(isLovely(sub)){
                    count++;
                }
            }

            if(count != 0){
                System.out.println("lovely " + count);
            }
            else{
                System.out.println("normal");
            }

        }
        sc.close();
    }
}
