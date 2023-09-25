import java.util.Scanner;

public class MaximumPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            int arr[] = new int[N];

            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }

            int maxpeaklen = 1;
            int pe = 0;
            int curphase = -2;
            int curpeaklen = 0;

            for(int e: arr){
                if(e  < pe){
                    if(curphase == -1){
                        curpeaklen++;
                    }
                    else{
                        curphase = -1;
                        curpeaklen++;
                    }
                }
                else if(e > pe){
                    if(curphase == 1){
                        curpeaklen++;
                    }
                    else{
                        if(curphase == -2){
                            curpeaklen = 1;
                        }
                        else{
                            curpeaklen = 2;
                        }
                        curphase = 1;
                    }
                }
                else{
                    curphase = 0;
                    curpeaklen = 1;
                }
                maxpeaklen = Math.max(maxpeaklen, curpeaklen);
                pe = e;
            }

            System.out.println(maxpeaklen);
        }
        sc.close();
    }
}
