import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            float HRA;
            float DA;
            if(X >= 1500){
                HRA = 500;
                DA = (float) (X* (0.98));
            }
            else{
                HRA = (float) (X * (0.10));
                DA = (float) (X* (0.90));
            }
            System.out.println((float) (X + HRA + DA));
        }
        
        sc.close();
    }
}
