import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumLengthEvenSubarray {
    public static int lenOfMaxSubSeq(List<Integer> array){
        int len = 0;
        int sum = 0;
        int max = -1000000;

        for(int  i: array){
            sum += i;
            len++;
        }

        if(sum % 2 == 0){
            return len;
        }

        for(int j: array){
            if(j % 2 != 0){
                max = Math.max(max,sum - j);
                len--;
                if(max % 2 == 0){
                    return len;
                }
            }
        }

        return len;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 1; i <= N; i++){
                arr.add(i);
            }

            System.out.println(lenOfMaxSubSeq(arr));

            arr.clear();
        }
        
        sc.close();
    }
}
