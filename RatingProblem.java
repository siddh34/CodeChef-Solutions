import java.util.Scanner;

class CheckTheRating{
    int currentRating;
    int currentlySolvingRating;
    CheckTheRating(int X,int Y){
        this.currentRating = X;
        this.currentlySolvingRating = Y;
    }

    public void check(){
        // * Range 
        int rangeX = this.currentRating;
        int rangeY = this.currentRating + 200;

        if(rangeX <= this.currentlySolvingRating && rangeY >= this.currentlySolvingRating){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

public class RatingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            CheckTheRating CR = new CheckTheRating(X,Y);
            CR.check();
            n--;
        }
        sc.close();
    }
}
