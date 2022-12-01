import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingPrettyNumbers {
    List<Integer> prettyNumbers = new ArrayList<Integer>();

    public void printCount(int L,int R){
        int count = 0;
        prettyNumbers.add(2);
        prettyNumbers.add(3);
        prettyNumbers.add(9);
        
        for(int i = L; i <= R; i++){
            if(prettyNumbers.contains(i%10)){
                count++;
            }
        }

        System.out.println(count);
        prettyNumbers.clear();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        // adding the pretty numbers

        CountingPrettyNumbers CPN = new CountingPrettyNumbers();

        while(T!=0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            CPN.printCount(L, R);
            T--;
        }
        
        sc.close();
    }
}
