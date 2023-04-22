import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModeOfFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int arr[] = new int[10];

            for(int i = 0; i < N; i++){
                arr[sc.nextInt()-1]++;
            }

            int max = 0, ans = 0;
            for(int i = 0; i < 10; i++){
                if(arr[i] > 0){
                    if(map1.containsKey(arr[i]))
                    {
                        map1.put(arr[i],map1.get(arr[i])+1);
                    }
                    else{
                        map1.put(arr[i],1);
                    }

                    if(map1.get(arr[i]) == max){
                        ans = Math.min(arr[i], ans);
                    }
                    else if(map1.get(arr[i]) > max){
                        max = map1.get(arr[i]);
                        ans = arr[i];
                    }
                }
            }

            System.out.println(ans);

            map1.clear();
        }
        
        sc.close();
    }
}
