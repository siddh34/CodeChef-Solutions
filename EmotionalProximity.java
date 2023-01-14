import java.util.Scanner;

public class EmotionalProximity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            double P = sc.nextDouble();
            double X = sc.nextDouble();
            double Y = sc.nextDouble();
            double Z = sc.nextDouble();

            if(Z == 0){
                P = P - (X*P)/100;
            }
            else{
                P = P + (Y*P)/100;
            }

            System.out.println(P);
        }
        
        sc.close();
    }
}
