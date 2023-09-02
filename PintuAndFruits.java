import java.util.Scanner;

public class PintuAndFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int types[] = new int[N];
            int fruitsCost[] = new int[N];

            for(int i = 0; i < N; i++){
                types[i] = sc.nextInt();
            }

            for(int i = 0; i < N; i++){
                fruitsCost[i] = sc.nextInt();
            }

            int totalCost = Integer.MAX_VALUE;
            for(int i = 1; i <= M; i++){
                int cost = 0; 
                boolean flag = false;
                for(int j = 0; j < N; j++){
                    if(types[j] == i){
                        cost += fruitsCost[j];
                        flag = true;
                    }
                }
                if(flag) totalCost = Math.min(totalCost,cost);
            }

            System.out.println(totalCost);
        }
        sc.close();
    }
}
