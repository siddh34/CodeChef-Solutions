import java.util.Scanner;

public class TooManyFloors {
    public static int Findfloor(int roomNo){
        int floor = 1;  

        while(!((10* (floor - 1) + 1) <= roomNo && roomNo <= 10*floor)){
            floor++;
        }

        return floor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(Math.abs(Findfloor(X) - Findfloor(Y)));
        }
        
        sc.close();
    }
}
