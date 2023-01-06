import java.util.Scanner;

public class IntegersThatSumToSameValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int N = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i + j == N){
                    count++;
                }
            }
        }

        System.out.println(count);
        
        
        sc.close();
    }
}
