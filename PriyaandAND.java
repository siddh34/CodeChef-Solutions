import java.util.Scanner;

public class PriyaandAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T)>=0){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++){
                A[i] = sc.nextInt();
            }
            int count = 0;
            if(N == 1){
                System.out.println(0);
            }
            else{
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if(i < j && ((A[i] & A[j]) == A[i])){
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
        }
        sc.close();
    }
}
