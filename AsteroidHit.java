import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AsteroidHit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        

        Stack<Integer> stack = new Stack<>();
        List<Integer> asteroids = new ArrayList<>();
        
        while((--T) >= 0){
            int N = sc.nextInt();
            int[] dir = new int[N];
            long[] power = new long[N];

            for(int i = 0; i < N; i++){
                dir[i] = sc.nextInt();
                power[i] = sc.nextLong();
            }

            for(int i = 0; i < N; i++){
                if(dir[i] == 1){
                    stack.push(i);
                }
                else{
                    // asteroids hit

                    while(!stack.isEmpty() && power[stack.peek()] < power[i]){
                        power[i] += power[stack.peek()];
                        stack.pop();
                    }

                    if(!stack.isEmpty()){

                        if(power[i] == power[stack.peek()]){
                            stack.pop();
                        }
                        else{
                            power[stack.peek()] += power[i];
                        }
                    
                    }
                    else{
                        asteroids.add(i);
                    }
                }
            }

            while(!stack.isEmpty()){
                asteroids.add(stack.pop());
            }

            Collections.sort(asteroids);

            System.out.println(asteroids.size());
            if(asteroids.size() > 0){
                for(int i: asteroids){
                    System.out.print(i + 1 + " ");
                }
            }

            stack.clear();
            asteroids.clear();
        }
        
        sc.close();
    }
}
