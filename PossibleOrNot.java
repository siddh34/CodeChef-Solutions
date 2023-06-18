import java.util.Scanner;
import java.util.function.Predicate;

public class PossibleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            int N = sc.nextInt();

            int k = sc.nextInt();

            int arr[] = new int[N];
            int temp = -1;
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
                Predicate<Integer> p1 = num->(num&k) == k;

                if(p1.test(arr[i])){
                    temp&=arr[i];
                }
            }

            System.out.println(temp == k ? "YES" : "NO");
        }
        
        sc.close();
    }
}
