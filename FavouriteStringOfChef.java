import java.util.Scanner;

public class FavouriteStringOfChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            String str = sc.next();

            int start = str.indexOf("code");
            int end = str.indexOf("chef");

            if(start<=end && end!=-1 && N == str.length()){
                System.out.println("AC");
            }
            else{
                System.out.println("WA");
            }
        }
        sc.close();
    }
}
