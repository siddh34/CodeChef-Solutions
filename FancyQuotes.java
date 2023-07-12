import java.util.Scanner;

public class FancyQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        while((--T)>=0){
            String str = sc.nextLine();
            String ans = " " + str + " ";
            if(ans.contains(" not ")){
                System.out.println("Real Fancy");
            }
            else{
                System.out.println("regularly fancy");
            }
        }
        
        sc.close();
    }
}
