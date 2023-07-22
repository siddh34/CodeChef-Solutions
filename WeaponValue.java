import java.util.Scanner;

public class WeaponValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();

            // fill strings array
            String arr[] = new String[N];
            for(int i=0; i<N; i++){
                arr[i] = sc.next();
            }

            int ans[] = new int[10];
            for(int i = 0; i < 10; i++){
                ans[i] = 0;
            }
            
            for(int i = 0; i < N; i++){
                char[] chararr = arr[i].toCharArray();

                for(int j = 0; j < 10; j++){
                    int val1 = Character.getNumericValue(chararr[j]);
                    int val2 = ans[j];
                    int val3 = val1 ^ val2;
                    ans[j] = val3;
                }
            }

            int count = 0;
            // check number of 1 in ans
            for(int i = 0; i < 10; i++){
                if(ans[i] == 1) count++;
            }

            System.out.println(count);
        }
        sc.close();
    }
}
