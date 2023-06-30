import java.util.Scanner;

public class TransfusionChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();
            
            int a = 0, b = 0, o = 0, ab = 0;
            
            for(int i = 0; i < N; i++){
                String str = sc.next();
                if(str.equals("A")){
                    a++;
                }
                else if(str.equals("B")){
                    b++;
                }
                else if(str.equals("O")){
                    o++;
                }
                else{
                    ab++;
                }
            }

            int result = Math.max(a,b);

            result += ab + o;

            System.out.println(result);
        }
        sc.close();
    }
}
