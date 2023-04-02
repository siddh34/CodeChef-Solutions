import java.util.Scanner;

public class CoronavirusSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();

        while((--T) >= 0){
            int N = sc.nextInt();
            int[] people = new int[N];

            for(int i = 0; i < N; i++){
                people[i] = sc.nextInt();
            }

            int count = 1;
            int i = 0;
            int max = 1,min = Integer.MAX_VALUE;

            for(;i < N - 1; i++){
                if(people[i + 1] - people[i] <= 2){
                    count++;
                }
                else{
                    if(count > max){
                        max = count;
                    } 

                    if(count < min){
                        min = count;
                        count = 1;
                    }
                }
            }

            if(count > max){
                max = count;
            }

            if(count < min){
                min = count;
                count = 1;
            }
            

            System.out.println(min + " " + max);
        }
        
        sc.close();
    }
}
