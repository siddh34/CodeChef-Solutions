import java.util.Scanner;


public class ColorTheCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            Long N = sc.nextLong();
            Long sum = (long) 0;

            for(int i = 0; i < 6; i++){
                sum += sc.nextLong();
            }

            if(N % 2 == 0){
                System.out.println(sum*(N/2));
            }
            else{
                System.out.println(sum*((N/2) + 1));
            }
        }
        
        sc.close();
    }
}
