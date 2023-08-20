import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class PopularRiceRecipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            Map<String,Integer> map = new HashMap<String,Integer>();

            for(int i = 0; i < N; i++){
                String name = sc.next();
                String sign = sc.next();

                int num;
                if(sign.equals("+")){
                    num = 1;
                }
                else{
                    num = -1;
                }

                if(map.containsKey(name)){
                    map.forEach((key,value) -> {
                        if(key.equals(name)){
                            map.put(key,num);
                        }
                    });
                }
                else{
                    map.put(name, num);
                }
            }

            AtomicInteger sum = new AtomicInteger(0);
            map.forEach((key,value) -> {
                sum.addAndGet(value);
            });

            System.out.println(sum.get());
        }
        sc.close();
    }
}
