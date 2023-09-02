import java.util.Scanner;

public class SpoonInMatrix {
    public static String getAns(String arr[],int N,int K){
        for(int i = 0; i < N; i++){
            String str = arr[i];
            str = str.toLowerCase();
            if(str.contains("spoon")){
                return "There is a spoon!";
            }
        }

        for (int i = 0; i < K; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < N; j++) {
                str.append(arr[j].charAt(i));
            }
            String s = str.toString().toLowerCase();
            if (s.contains("spoon")) {
                return "There is a spoon!";
            }
        }

        return "There is indeed no spoon!";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            String arr[] = new String[N];
            for(int i = 0; i < N; i++) {
                String str = sc.next();
                str = str.toLowerCase();
                arr[i] = str;
            }

            System.out.println(getAns(arr,N,K));
        }
        sc.close();
    }
}
