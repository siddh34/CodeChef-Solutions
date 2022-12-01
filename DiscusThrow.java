import java.util.Scanner;

public class DiscusThrow {
    public static int getMax(int[] arr){
        int max = 0;

        for(int i: arr){
            if(max < i){
                max = i;
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] array = new int[3];

        while(T!=0){
            for(int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println(getMax(array));

            T--;
        }


        sc.close();
    }
}
