import java.util.Scanner;

class Tax{
    int earnings;
    // construction
    Tax(int totalearnings){
        this.earnings = totalearnings;
    }

    public int getReductionIfAny(){
        if(this.earnings > 100){
            return this.earnings - 10;
        }
        else{
            return this.earnings;
        }
    }
}

public class CheflandTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int earnings = sc.nextInt();
            Tax tax = new Tax(earnings);
            System.out.println(tax.getReductionIfAny());
            n--;
        }
        sc.close();
    }
}
