import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CuttingRecipes {
    public static int GCF(int num1,int num2){
        while(num1 != num2){
            if(num1 > num2){
                num1 = num1 - num2;
            }
            else{
                num2 = num2 - num1;
            }
        }

        return num1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                list.add(sc.nextInt());
            }

            int result = list.get(0);
            for(int K = 1; K < N; K++){
                result = GCF(result,list.get(K));
            }

            for(int J: list){
                J = J / result;
                System.out.print(J + " ");
            }

            System.out.println();

            list.clear();
        }   
        
        sc.close();
    }
}
