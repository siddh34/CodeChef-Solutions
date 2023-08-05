import java.util.Scanner;

public class AnotherCardGameProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int Pc = sc.nextInt();
            int Pr = sc.nextInt();

            int digitC = Pc/9;
            int digitR = Pr/9;

            if(digitC == digitR){
                System.out.println(1 + " " + (Pc%9 == 0 ? digitC : digitC + 1));
            }
            else if(digitC > digitR){
                System.out.println(1 + " " + (Pr%9 == 0 ? digitR : digitR + 1));
            }
            else if(digitC < digitR){
                System.out.println(0 + " " + (Pc%9 == 0 ? digitC : digitC + 1));
            }
        }
        sc.close();
    }
}
