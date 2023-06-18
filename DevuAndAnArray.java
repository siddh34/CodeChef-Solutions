import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevuAndAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> arr = new ArrayList<Integer>();

        int n = sc.nextInt();
        int q = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(max < arr.get(i)){
                max = arr.get(i);
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(min > arr.get(i)){
                min = arr.get(i);
            }
        }

        int t = 0;
        for(int i = 0; i < q; i++){
            t = sc.nextInt();
            if(t >= min && t <= max){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
        
        arr.clear();
        
        
        sc.close();
    }
}
