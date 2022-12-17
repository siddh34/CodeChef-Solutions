import java.util.Scanner;

public class Speciality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if(X > Y && X > Z){
                System.out.println("Setter");
            }
            else if(Y > X && Y > Z){
                System.out.println("Tester");
            }
            else{
                System.out.println("Editorialist");
            }

        }
        
        sc.close();
    }
}
