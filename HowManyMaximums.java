import java.util.Scanner;

public class HowManyMaximums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            String str = sc.next();

            char arr[] = str.toCharArray();
            int count = 1;
            int curr = 0;
            int last = 0;
            for(int i = 0; i < N - 1; i++){
                curr = arr[i] - '0';
                if(curr < last) {
                    count++;
                }
                last = curr;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
