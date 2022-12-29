import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int M = sc.nextInt();
            int H = sc.nextInt();

            if((M/(H*H)) <= 18){
                System.out.println(1);
            }
            else if((M/(H*H)) >= 19 && (M/(H*H)) <= 24){
                System.out.println(2);
            }
            else if((M/(H*H)) >= 25 && (M/(H*H) <= 29)){
                System.out.println(3);
            }
            else if((M/(H*H)) >= 30){
                System.out.println(4);
            }
        }
        
        sc.close();
    }
}
