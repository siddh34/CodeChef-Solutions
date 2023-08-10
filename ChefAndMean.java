import java.util.Scanner;

public class ChefAndMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            long arr[] = new long[N];
            long sum = 0;
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if(sum % N == 0){
                long temp = sum / N;
                boolean found = false;
                int index = 0;
                for(int i = 0; i < N; i++){
                    if(temp == arr[i]){
                        index = i;
                        found = true;
                        break;
                    }
                }

                if(found){
                    System.out.println(index + 1);
                }
                else{
                    System.out.println("Impossible");
                }
            }
            else{
                System.out.println("Impossible");
            }
        }
        sc.close();
    }
}
