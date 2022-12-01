import java.util.Scanner;

public class practiceMakesUsPerfect {
    
    public static int greaterThanTen(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 10){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(practiceMakesUsPerfect.greaterThanTen(arr));
        sc.close();
    }
}
