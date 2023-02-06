import java.util.Scanner;

public class HiddenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int a = 1;
            for(int i = 2; i <N; i++){
                if(N%i == 0){
                    a = i;
                    break;
                }
            }

            System.out.println(a + " " + N/a);
        }


        sc.close();
    }
}
