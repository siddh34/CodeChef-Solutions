import java.util.Scanner;

public class EndSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int N = sc.nextInt();   

            int[] array = new int[N];
            for(int i=0; i<N; i++){
                array[i] = sc.nextInt();
            }
            
            int p1 = 0;
            int p2 = 0;

            while(array[p1++] != 1){}
            while(array[p2++] != N){}

            int moves = p1 + (N - 1 - p2);

            if(p1>p2){
                --moves;
            }

            System.out.println(moves);
        }
        
        sc.close();
    }
}
