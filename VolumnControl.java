import java.util.Scanner;


class Control{
    int rangeX;
    int rangeY;
    // constructor
    Control(int x, int y){
        this.rangeX = x;
        this.rangeY = y;
    }

    public int findDifference(){
        return Math.abs(this.rangeY - this.rangeX);
    }
}

public class VolumnControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            Control c = new Control(X,Y);
            System.out.println(c.findDifference());
            n--;
        }
        sc.close();
    }
}
