import java.util.Scanner;

//package companyName;

class Compare{
    int valueOfCab1;
    int valueOfCab2;
    // constructor
    Compare(int X,int Y){
        this.valueOfCab1 = X;
        this.valueOfCab2 = Y;
    }

    public void result(){
        if(this.valueOfCab1 < this.valueOfCab2){
            System.out.println("FIRST");
        }
        else if(this.valueOfCab1 == this.valueOfCab2){
            System.out.println("ANY");
        }
        else{
            System.out.println("SECOND");
        }
    }
}

class TheCheaperCab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            Compare c = new Compare(X,Y);
            c.result();
            n--;
        }
        sc.close();
    }
}