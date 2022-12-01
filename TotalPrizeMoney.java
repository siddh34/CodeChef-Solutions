import java.util.Scanner;

//package companyName;

class TotalPrizeMoney{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int X = sc.nextInt();
            int Y = sc.nextInt();

            System.out.println(X*10 + Y*90);
        }

        sc.close();
    }
}