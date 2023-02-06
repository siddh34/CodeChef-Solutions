import java.util.Scanner;

public class SlowSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while((--T) >= 0){
            int maxT = sc.nextInt();
            int maxN = sc.nextInt();
            int sumN = sc.nextInt();

            int t = sumN/maxN;
            int r = sumN%maxN;

            if(t < maxT){
                System.out.println(t*maxN*maxN + r*r);
            }
            else{
                System.out.println(maxN*maxT*maxN);
            }
        }
        
        sc.close();
    }
}
