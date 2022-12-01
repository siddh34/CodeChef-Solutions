import java.util.Scanner;

public class ChefsTodo {
    
    public static int greaterThanThousand(int[] D){ 
        int count = 0;

        for(int numb: D){
            if(numb >= 1000){
                count++;
            }
        }

        return count;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();
            int[] D = new int[N];
            for(int i = 0; i < N; i++){
                D[i] = sc.nextInt();
            }
            System.out.println(ChefsTodo.greaterThanThousand(D));
            T--;
        }
        
        sc.close();
    }
}
