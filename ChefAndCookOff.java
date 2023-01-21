import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChefAndCookOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Integer> solved = new ArrayList<Integer>();

        while((--T) >= 0){
            int count = 0;
            
            for(int i = 0; i < 5; i++){
                solved.add(sc.nextInt());
            }

            for(int i: solved){
                if(i == 1){
                    count++;
                }
            }

            switch (count) {
                case 0:
                    System.out.println("Beginner");
                    break;
                case 1:
                    System.out.println("Junior Developer");
                    break;
                case 2:
                    System.out.println("Middle Developer");
                    break;
                case 3:
                    System.out.println("Senior Developer");
                    break;
                case 4:
                    System.out.println("Hacker");
                    break;
                case 5:
                    System.out.println("Jeff Dean");
                    break;
                default:
                    break;
            }

            solved.clear();
        }
        
        sc.close();
    }
}
