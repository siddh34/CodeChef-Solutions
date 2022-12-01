import java.util.Scanner;

public class MiamiGP {

    public static void whetherChefCanParticipate(float X,float Y){
        if(X*1.07 >= Y){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n!=0){
            float X = sc.nextInt();
            float Y = sc.nextInt();
            MiamiGP.whetherChefCanParticipate(X, Y);
            n--;
        }

        sc.close();
    }
}
