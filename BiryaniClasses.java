import java.util.Scanner;

class TotalAmountNeeded{
    int noOfWeeks;
    int amountForThatWeek;

    TotalAmountNeeded(int weeks,int amount){
        this.noOfWeeks = weeks;
        this.amountForThatWeek = amount;
    }

    public int calculateAmount(){
        return this.noOfWeeks*this.amountForThatWeek;
    }
}

public class BiryaniClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int weeks = sc.nextInt();
            int amount = sc.nextInt();
            TotalAmountNeeded TAN = new TotalAmountNeeded(weeks, amount);
            System.out.println(TAN.calculateAmount());
            n--;
        }
        sc.close();
    }
}
