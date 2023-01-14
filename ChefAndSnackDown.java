import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndSnackDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        // adding the years to check
        list.add(2019);
        list.add(2010);
        list.add(2015);
        list.add(2017);
        list.add(2016);

        while((--T) >= 0){
            int year = sc.nextInt();

            if(list.contains(year)){
                System.out.println("HOSTED");
            }
            else{
                System.out.println("NOT HOSTED");
            }
        }
        
        sc.close();
    }
}
