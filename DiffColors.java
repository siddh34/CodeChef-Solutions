import java.util.Scanner;

public class DiffColors {

    public static void getNumberOfBoxes(int[] arr){
        int max = 0;

        for(int i: arr){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        while(T!=0){
            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            DiffColors.getNumberOfBoxes(arr);

            T--;
        }

        sc.close();

    }
}
