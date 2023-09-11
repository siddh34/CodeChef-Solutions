import java.util.Scanner;

public class RestroPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int tp[] = new int[n];
        int pp[] = new int[m];

        for(int i = 0; i < n; i++){
            tp[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++){
            pp[i] = sc.nextInt();
        }

        boolean flag = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(tp[i]+pp[j] == c){
                    flag = true;
                    System.out.println("YES");
                    break;
                }
            }
            if(flag) break;
        }

        if(!flag) System.out.println("NO");
        sc.close();
    }
}
