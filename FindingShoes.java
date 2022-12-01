import java.util.Scanner;

public class FindingShoes {
    public static void getLeftShoeCount(int noOfFriends,int noOfLeftShoes){
        int diff = Math.abs(noOfLeftShoes - noOfFriends);
        int remainingShoes = 0;
        if(noOfFriends > noOfLeftShoes){
            remainingShoes = noOfLeftShoes + diff*2;
        }
        else if(noOfLeftShoes > noOfFriends){
            remainingShoes = diff;
        }
        else if(noOfLeftShoes == noOfFriends){
            remainingShoes = noOfLeftShoes;
        }
        System.out.println(remainingShoes);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            FindingShoes.getLeftShoeCount(N, M);
            T--;
        }

        sc.close();
    }
}
