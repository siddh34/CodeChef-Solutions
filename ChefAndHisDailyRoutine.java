import java.util.Scanner;

public class ChefAndHisDailyRoutine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T)>=0){
            String str = sc.next();

            boolean flag = true;
            for(int i = 0; i < str.length() - 1; i++){
                if((str.charAt(i) == 'E' && str.charAt(i + 1) == 'C') || (str.charAt(i) == 'S' && (str.charAt(i + 1) == 'E' || str.charAt(i + 1) == 'C'))){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}
