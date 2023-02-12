import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> protein = new ArrayList<Integer>();


        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N; i++){
                protein.add(sc.nextInt());
            }

            int saves = 0,loss = 0;
            for(int i = 0; i < protein.size(); i++){
                if(protein.get(i) > K){
                    saves += protein.get(i) - K;
                }
                else if(protein.get(i) + saves < K){
                    loss += K - protein.get(i);
                    System.out.println("NO " + (i + 1));
                    break;
                }
                else if(protein.get(i) + saves >= K){
                    saves -= Math.abs(protein.get(i) - K);
                }
            }

            if(loss == 0){
                System.out.println("YES");
            }

            protein.clear();
        }
        
        sc.close();
    }
}
