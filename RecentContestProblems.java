import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RecentContestProblems {
    
    public static void getCount(List<String> contestPRB){
        Set<String> typeOfContest = new HashSet<String>();

        typeOfContest.add("a");
        typeOfContest.add("b");


        for(String s: typeOfContest){
            System.out.print(Collections.frequency(contestPRB, s) + " ");
        }

        System.out.println();

        typeOfContest.clear();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> contestPRB = new ArrayList<String>();
        int T = sc.nextInt();

        while(T!=0){
            int n = sc.nextInt();

            for(int i = 0; i < n; i++){
                contestPRB.add(sc.next());
            }

            RecentContestProblems.getCount(contestPRB);

            contestPRB.clear();
            T--;
        }
        
        sc.close();
    }
}
