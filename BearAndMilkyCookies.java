import java.util.Scanner;

public class BearAndMilkyCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            String A[] = new String[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.next();
            }

            if(A[N - 1].equals("cookie")){
                System.out.println("NO");
            }
            else{
                boolean isValid = true;
                for(int i = 0; i < N - 1; i++){
                    if(A[i].equals("cookie") && A[i + 1].equals("cookie")){
                        isValid = false;
                        break;
                    }
                }            

                if(isValid){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
