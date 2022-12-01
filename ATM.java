import java.util.Scanner;

class WithDraw{
    float amountToBeDrawed;
    float initialAmount;
    private float charges = (float) 0.50;
    WithDraw(float amountDrawn, float initialAmount){
        this.amountToBeDrawed = amountDrawn;
        this.initialAmount = initialAmount;
    }

    public float drawnAmount(){
        if(this.initialAmount % 5 == 0 &&  (this.initialAmount - this.charges) >= this.amountToBeDrawed){
            return ((this.initialAmount - this.amountToBeDrawed)- this.charges);
        }
        return this.initialAmount;
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amountToBeDrawed = sc.nextFloat();
        float initialAmount = sc.nextFloat();
        WithDraw draw = new WithDraw(amountToBeDrawed,initialAmount);
        System.out.println(draw.drawnAmount());
        sc.close();
    }
}
