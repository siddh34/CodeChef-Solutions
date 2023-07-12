import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carvans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> cars = new ArrayList<Integer>();

        while((--T)>=0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                cars.add(sc.nextInt());
            }

            int count = 1;
            for(int i = 1; i < N; i++){
                if(cars.get(i - 1) < cars.get(i)){
                    cars.set(i, cars.get(i - 1));
                }
                else{
                    count++;
                }
            }

            System.out.println(count);

            cars.clear();
        }
        
        sc.close();
    }
}
