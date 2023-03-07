import java.util.Scanner;

public class BetterDeal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float A = sc.nextInt();
            float B = sc.nextInt();

            float vad1 = 100 - ((100*A)/100); 
            float vad2 = 200 - ((200*B)/100);

            if(vad1 < vad2){
                System.out.println("FIRST");
            }
            else if(vad1 > vad2){
                System.out.println("SECOND");
            }
            else{
                System.out.println("BOTH");
            }
        }
        
        sc.close();
    }
}
