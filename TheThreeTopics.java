import java.util.Scanner;

public class TheThreeTopics {
    
    public void didChefPass(int[] arr){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int X = sc.nextInt();

        for(int k: arr){
            if(k == X){
                System.out.println("YES");
                System.exit(0);
            }
        }

        System.out.println("NO");

        sc.close();
    }
}
