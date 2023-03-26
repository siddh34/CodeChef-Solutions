import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MakingAMeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        Map<Character,Integer> myMap = new HashMap<>();
        List<Character> meal = new ArrayList<>();
        List<String> S = new ArrayList<>();

        // adding codechef here
        meal.add('c');
        meal.add('o');
        meal.add('d');
        meal.add('e');
        meal.add('h');
        meal.add('f');


        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                S.add(sc.next());
            }

            for(String k: S){
                for(int i = 0; i < k.length(); i++){
                    char c = k.charAt(i);
                    if(meal.contains(c)){
                        myMap.put(c,myMap.getOrDefault(c, 0) + 1);
                    }
                }
            }

            int c = 0;
            int o = 0;
            int d = 0;
            int e = 0;
            int h = 0;
            int f = 0;

            for(char i: myMap.keySet()){
                if(i == 'c'){
                    c = myMap.get(i);
                }
                else if(i == 'o'){
                    o = myMap.get(i);
                }
                else if(i == 'd'){
                    d = myMap.get(i);
                }
                else if(i == 'e'){
                    e = myMap.get(i);
                }
                else if(i == 'h'){
                    h = myMap.get(i);
                }
                else if(i == 'f'){
                    f = myMap.get(i);
                }
            }

            int count = 0;
            int range = (c/2);

            for(int i = 0; i < range; i++){
                if((c<=1) || (e<=1) || (o==0) || (d==0) || (f==0) || (h==0)){
                    break;
                }
                else{
                    c-=2;
                    e-=2;
                    o--;
                    d--;
                    h--;
                    f--;
                    count++;
                }
            }

            System.out.println(count);

            S.clear();
            myMap.clear();
        }
        
        sc.close();
    }
}
