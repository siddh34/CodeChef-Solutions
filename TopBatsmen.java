import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TopBatsmen {
    public static int fact(int n){
        if(n == 0 || n == 1) return 1;

        return fact(n - 1) * n;
    }

    public static int nCr(int n,int r){
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int a[] = new int[11];

            for(int i = 0; i < 11; i++){
                a[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int element : a){
                map.put(element,map.getOrDefault(element, 0) + 1);
            }

            Arrays.sort(a);

            HashMap<Integer, Integer> nmap = new HashMap<Integer,Integer>();

            for(int i = 10; i > 10 - k; i--){
                nmap.put(a[i],nmap.getOrDefault(a[i],0)+1);
            }

            List<Integer> temp = new ArrayList<>();
            int count = 0;
            for(int i = 10; i > 10 - k; i--){
                if (!temp.contains(a[i]) && map.get(a[i]) > 1 && nmap.containsKey(a[i])) {

                    int tempVar = nCr(map.get(a[i]), nmap.get(a[i]));

                    if (tempVar != 1) {
                        count += tempVar;
                    }

                    temp.add(a[i]);
                }
            }

            if(count == 0){
                System.out.println(1);
            }
            else{
                System.out.println(count);
            }
        }
        sc.close();
    }
}
