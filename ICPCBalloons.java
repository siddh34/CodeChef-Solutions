import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ICPCBalloons {
    
    public static int getCount(List<Integer> problems){
        List<Integer> myList = new ArrayList<Integer>();

        for(int i = 0; i < problems.size(); i++){
            if(myList.contains(1) && myList.contains(2) && myList.contains(3) && myList.contains(4) && myList.contains(5) && myList.contains(6) && myList.contains(7)){
                break;
            }
            myList.add(problems.get(i));
        }

        int size = myList.size();
        myList.clear();
        return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> problems = new ArrayList<>();

        while((--T) >= 0){
            int N = sc.nextInt();

            for(int i = 0; i < N; i++){
                problems.add(sc.nextInt());
            }

            System.out.println(getCount(problems));

            problems.clear();
        }
        
        sc.close();
    }
}
