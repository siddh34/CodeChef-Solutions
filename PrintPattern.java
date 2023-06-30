import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T)>=0){
            int N = sc.nextInt();

            int num = 1;
            int c = 0;
            int [][]arr = new int[100][100];
            while(num != N*N + 1){
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if(i + j == c){
                            arr[i][j] = num;
                            num++;
                        }
                    }
                }
                c++;
            }

            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}
