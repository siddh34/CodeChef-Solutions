import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfDefenceTraining {
    List<Integer> age = new ArrayList<Integer>();
    
    public int noOfElegiables(int number,Scanner sc){
        int count = 0;

        for(int i=0; i<number; i++){
            age.add(sc.nextInt());
        }

        for(int j: age){
            if(j <= 60 && j >= 10){
                count++;
            }
        }

        age.clear();

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        SelfDefenceTraining sdt = new SelfDefenceTraining();

        while(T!=0){
            int number = sc.nextInt();
            System.out.println(sdt.noOfElegiables(number, sc));
            T--;
        }

        sc.close();
    }
}
