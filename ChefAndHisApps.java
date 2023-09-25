import java.util.Scanner;

public class ChefAndHisApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if ((s - (x + y)) >= z)
                System.out.println(0);

            if ((s - (x + y)) < z) {
                if(x >= z || y >= z){
                    System.out.println(1);
                }
                else if((s-(x+y))+x >= z || (s - (x+y)) + y >= z){
                    System.out.println(1);
                }
                else{
                    System.out.println(2);
                }
            }
        }
        sc.close();
    }
}
