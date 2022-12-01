import java.util.Scanner;

public class MakeAllEqualUsingPairs {

    public static int operationsCount(int[] arr){
        int count = 0;
        int constant = getMaxFeqElement(arr);

        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=constant){
                count++;
            } 
        }

        return count;
    }

    public static int getMaxFeqElement(int[] arr){
        int maxFreqCount = 0;
        int maxFreqElement = 0;

        for(int i=0; i<arr.length; i++){
            int count = 0;

            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > maxFreqCount){
                maxFreqCount = count;
                maxFreqElement = arr[i];
            }
        }
        return maxFreqElement;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T!=0){
            int N = sc.nextInt();

            int arr[] = new int[N];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(operationsCount(arr));

            T--;
        }

        sc.close();
    }
}
