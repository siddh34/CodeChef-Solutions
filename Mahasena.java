import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasena {
    public static void isReady(List<Integer> noWeapons){
        boolean isReady = false;
        int even = 0;
        int odd = 0;

        for(Integer i : noWeapons){
            if(i%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }

        if(even > odd){
            isReady = true;
        }

        if(isReady){
            System.out.println("READY FOR BATTLE");
        }
        else{
            System.out.println("NOT READY");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> noWeapons = new ArrayList<Integer>();
        
        int T = sc.nextInt();

        while(T!=0){
            int n = sc.nextInt();
            noWeapons.add(n);
            T--;
        }

        Mahasena.isReady(noWeapons);

        sc.close();
    }
}
