import java.util.Scanner;

class Manipulation{
    int ezioCanManipulate;
    int totalMen;
    Manipulation(int givenManEzioCanManipulate,int givenTotalMen){
        this.ezioCanManipulate = givenManEzioCanManipulate;
        this.totalMen = givenTotalMen;
    }

    public void predict(){
        if(this.totalMen == this.ezioCanManipulate){
            System.out.println("YES");
        }
        else if(this.totalMen < this.ezioCanManipulate){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}

public class EzioAndApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int ezioManipultes = sc.nextInt();
            int totalMen = sc.nextInt();
            Manipulation M = new Manipulation(ezioManipultes,totalMen);
            M.predict();
            n--;
        }
        sc.close();
    }
}
