import java.util.Scanner;

public class VaccineDates {

    public static final String okSecondDose(int D,int L,int R){
        String res = "";

        if(D < L){
            res = "Too Early";
        }
        else if(D >= L && D <= R){
            res = "Take second dose now";
        }
        else if(D > R){
            res = "Too Late";
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int D = sc.nextInt();
            int L = sc.nextInt();
            int R = sc.nextInt();

            System.out.println(okSecondDose(D, L, R));

            T--;
        }

        sc.close();
    }
}
