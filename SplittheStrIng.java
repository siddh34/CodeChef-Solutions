import java.util.Scanner;

public class SplittheStrIng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            String str = sc.next();

            boolean flag = false;
            for(int i = 0; i < N; i++){
                if(str.charAt(i) == str.charAt(N - 1)){
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
