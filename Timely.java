import java.util.Scanner;

// package XYZ

class CheckTime{
    int timeChefLeft;
    // constructor
    CheckTime(int X){
        this.timeChefLeft = X;
    }

    public void whetherOnTime(){
        if(this.timeChefLeft - 30 >= 0){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}

public class Timely {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int theTimeChefLeft = sc.nextInt();
            CheckTime CT = new CheckTime(theTimeChefLeft);
            CT.whetherOnTime();
            n--;
        }
        sc.close();
    }
}
