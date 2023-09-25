import java.util.Scanner;

public class ChefAndStringGreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String str = sc.next();
            int N = str.length();

            int pair = 0;
            for(int i = 0; i < N - 1; i++){
                if((str.charAt(i) == 'x' && str.charAt(i+1) == 'y') || (str.charAt(i) == 'y' && str.charAt(i+1) == 'x')){
                    pair++;
                    i++;
                }
            }

            System.out.println(pair);
        }
        sc.close();
    }
}
