import java.util.Scanner;

class HowManyBurgers{
    int countOfPatties;
    int countOfBuns;
    HowManyBurgers(int A,int B){
        this.countOfPatties = A;
        this.countOfBuns = B;
    }
    public void noOfBurgersThatCanBeMade() {
        if(this.countOfBuns < this.countOfPatties){
            System.out.println(this.countOfBuns);
        }
        else if(this.countOfBuns > this.countOfPatties){
            System.out.println(this.countOfPatties);
        }
        else{
            System.out.println(this.countOfBuns);
        }
    }
}

public class Burgers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int givenCountOfPatties = sc.nextInt();
            int countOfBuns = sc.nextInt();
            HowManyBurgers HMB = new HowManyBurgers(givenCountOfPatties,countOfBuns);
            HMB.noOfBurgersThatCanBeMade();
            n--;
        }
        sc.close();
    }
}
