import java.util.Scanner;

public class LifeTheUniverseAndEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            int x = sc.nextInt();
            if(x != 42){
                System.out.println(x);
            }
            else{
                sc.close();
                break;
            }
        }
    }
}
