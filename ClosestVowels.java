import java.util.Scanner;

public class ClosestVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            String Str = sc.next();

            long l = 1L;

            char[] arr = Str.toCharArray();

            // ch[i] == 'c' || ch[i] == 'g' || ch[i] == 'l' || ch[i] == 'r'

            for(int i = 0; i < N; i++){
                if(arr[i] == 'c' || arr[i] == 'g' || arr[i] == 'l' || arr[i] == 'r'){
                    l = (l * 2) % 1000000007;
                }
            }

            System.out.println(l);
        }
        
        sc.close();
    }
}
