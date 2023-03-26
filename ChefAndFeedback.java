import java.util.Scanner;

public class ChefAndFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            String str = sc.next();
            
            if(str.contains("010") || str.contains("101")){
                System.out.println("Good");
            }
            else{
                System.out.println("Bad");
            }
        }
        
        sc.close();
    }
}
