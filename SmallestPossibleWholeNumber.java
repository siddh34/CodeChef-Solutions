import java.util.Scanner;

//package companyName;



public class SmallestPossibleWholeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int temp;

        while(T!=0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            if((N - K)< 0){
                temp = K;
            }else{
                temp = N - K;
            }
            while(K < temp){
                temp = temp - K;
            }
            System.out.println(temp);
            T--;
        }

        sc.close();
    }
}