import java.util.Scanner;

public class ElectionsInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            int Xc = sc.nextInt();


            if(Xa > 50){
                System.out.println("A");
            }
            else if(Xb > 50){
                System.out.println("B");
            }
            else if(Xc > 50){
                System.out.println("C");
            }
            else{
                System.out.println("NOTA");
            }
        }
        
        sc.close();
    }
}
