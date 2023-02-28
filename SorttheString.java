import java.util.Scanner;

public class SorttheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();

            String str = sc.next();

            int count = 0;
            for(int i = 0; i < N - 1; i++){
                if(str.charAt(i) == '1' && str.charAt(i + 1) == '0'){
                    count++;
                    i++;
                }
            }

            System.out.println(count);
        }
        
        sc.close();
    }
}
