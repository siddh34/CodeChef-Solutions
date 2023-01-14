import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long X = sc.nextLong();
            boolean found = false;

            Long temp = X;
            Long rem = (long)
            0;
            while(temp > 0){
                rem = temp % 10;
                temp = temp / 10;
                if(rem == 7){
                    found = true;
                    break;
                }
            }

            if(found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
