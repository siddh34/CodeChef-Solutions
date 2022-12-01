import java.util.Scanner;

class CheckAgeLimit{
    int rangeX;
    int rangeY;
    int chefAge;
    CheckAgeLimit(int X,int Y,int chefAge){
        this.rangeX = X;
        this.rangeY = Y;
        this.chefAge = chefAge;
    }

    public void checkChefAge(){
        if(this.rangeX > this.chefAge || this.rangeY <= this.chefAge){
            System.out.println("NO");
        }
        else if (this.rangeY > this.chefAge || this.rangeX <= this.chefAge){
            System.out.println("YES");
        }
    }
}

public class AgeLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int chefAge = sc.nextInt();
            CheckAgeLimit CAL = new CheckAgeLimit(X,Y,chefAge);
            CAL.checkChefAge();
            n--;
        }
        sc.close();
    }
}
