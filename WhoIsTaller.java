import java.util.Scanner;

// package XYZ

/* Problem Statement

Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, and decided to settle the matter once and for all.

Charlie measured the heights of Alice and Bob, and got to know that Alice's height is XX centimeters and Bob's height is YY centimeters. Help Charlie decide who is taller.

It is guaranteed that X!=Y.

*/

class IsTaller{
    int heightA;
    int heightB;
    // constructor
    IsTaller(int givenHeightOfA,int givenHeightOfB){
        this.heightA = givenHeightOfA;
        this.heightB = givenHeightOfB;
    }

    public void amTaller(){
        if(this.heightA > this.heightB){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
    }

}

public class WhoIsTaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int heightOfA = sc.nextInt();
            int heightOfB = sc.nextInt();
            IsTaller IT = new IsTaller(heightOfA,heightOfB);
            IT.amTaller();
            n--;
        }
        sc.close();
    }
}
