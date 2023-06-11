import java.util.Scanner;

public class Subanagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] res = new int[26];

        for(int i = 0; i < N; i++){
            String str = sc.next();

            if(i == 0){
                for(char c: str.toCharArray()){
                    res[c - 'a'] += 1;
                }
            }
            else{
                int[] curr = new int[26];
                for(char c: str.toCharArray()){
                    curr[c - 'a'] += 1;
                }

                // getting the result finally
                for(int j = 0; j < 26; j++){
                    res[j] = Math.min(res[j],curr[j]);
                }
            }
        }

        // extracting the answer
        String ans = "";
        for(int j = 0; j < 26; j++){
            if(res[j] > 0){
                int count = res[j];
                while(count-- > 0){
                    ans = ans + ((char) (j + 'a'));
                }
            }
        }

        if(ans.equals("")){
            System.out.println("no such string");
        }
        else{
            System.out.println(ans);
        }

        sc.close();
    }
}
