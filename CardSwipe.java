import java.util.HashSet;
import java.util.Scanner;

public class CardSwipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashSet<Integer> office = new HashSet<Integer>();
        while(T-->0){
            int N = sc.nextInt();

            int max = Integer.MIN_VALUE;
            for(int i = 0; i < N; i++){
                int employeeid = sc.nextInt();
                if(office.contains(employeeid)){
                    office.remove(employeeid);
                }
                else{
                    office.add(employeeid);
                    max = Math.max(office.size(),max);
                }
            }

            System.out.println(Math.max(office.size(),max));

            office.clear();
        }
        sc.close();
    }
}
