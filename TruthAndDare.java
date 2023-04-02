import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TruthAndDare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        Set<Integer> Trl = new HashSet<Integer>();
        Set<Integer> Drl = new HashSet<Integer>();
        Set<Integer> Tsl = new HashSet<Integer>();
        Set<Integer> Dsl = new HashSet<Integer>();
        
        while((--T) >= 0){
            int tr = sc.nextInt();

            for(int i = 0; i < tr; i++){
                Trl.add(sc.nextInt());
            }
            
            int dr = sc.nextInt();
            
            for(int i = 0; i < dr; i++){
                Drl.add(sc.nextInt());
            }
            
            int ts = sc.nextInt();
            
            for(int i = 0; i < ts; i++){
                Tsl.add(sc.nextInt());
            }

            int ds = sc.nextInt();
            
            for(int i = 0; i < ds; i++){
                Dsl.add(sc.nextInt());
            }

            if(Trl.containsAll(Tsl) && Drl.containsAll(Dsl)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }

            Trl.clear();
            Drl.clear();
            Tsl.clear();
            Dsl.clear();
        }
        
        sc.close();
    }
}
