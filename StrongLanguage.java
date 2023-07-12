import java.util.Scanner;

public class StrongLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            String str = sc.next();
            
            int count = 0;
            for(int i=0; i<N; i++){
                if(str.charAt(i) == '*'){
                    count++;
                    if(count == K){
                        break;
                    }
                }
                else{
                    count = 0;
                }
            }

            if(count >= K){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
