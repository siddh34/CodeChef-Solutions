import java.util.Scanner;

public class TestAverages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            float A = sc.nextInt();
            float B = sc.nextInt();
            float C = sc.nextInt();
            float k = ((A+B)/2);
            float j = ((C+B)/2);
            float i = ((C+A)/2);

            if( k < 35 || j < 35 ||  i < 35){
                System.out.println("FAIL");
            }
            else{
                System.out.println("PASS");
            }
        }
        
        sc.close();
    }
}