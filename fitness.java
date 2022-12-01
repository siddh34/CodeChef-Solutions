import java.util.Scanner;

class CalculateDistance{
    int distance;
    CalculateDistance(int distanceTravelledOneTime){
        this.distance = distanceTravelledOneTime;
    }

    public int getCalculatedDistance(){
        return this.distance*10;
    }

}

public class fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0){
            int distance = sc.nextInt();
            CalculateDistance CD = new CalculateDistance(distance);
            System.out.println(CD.getCalculatedDistance());
            n--;
        }
        sc.close();
    }
}
