import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedLightGreenLight {
    public static int needToGetShot(List<Integer> peopleInBetween,int K){
        int count = 0;

        for(int j: peopleInBetween){
            if(j > K){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        List<Integer> peopleInBetween = new ArrayList<Integer>();

        while((--T) >= 0){
            int N = sc.nextInt();
            int K = sc.nextInt();

            for(int i = 0; i < N;i++){
                peopleInBetween.add(sc.nextInt());
            }

            System.out.println(needToGetShot(peopleInBetween, K));

            peopleInBetween.clear();
        }
        
        sc.close();
    }
}
